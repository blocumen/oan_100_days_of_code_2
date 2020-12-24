package java.org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;
import org.aion.avm.userlib.abi.ABIDecoder;

public class Temp
{

   // @Initializable
    private static String myString;

    //@Initializable
    private static int[] intArray;

    static
    {
       /* ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
        String myStr = decoder.decodeOneString();
       int[] myIntArray = decoder.decodeOneIntegerArray();
        int[][] myTwoDIntArray = decoder.decodeOne2DIntegerArray();
*/
    }
    @Callable
    public static void logMyString(String topic)
    {
        Blockchain.log(topic.getBytes(), Blockchain.getCaller().toByteArray());
    }

    @Callable
    public static String getString()
    {
        return myString;
    }

    @Callable
    public static int getIntFromArray(int index)
    {
        return intArray[index];
    }

}

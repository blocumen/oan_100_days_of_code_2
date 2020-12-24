package java.org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import avm.Address;

public class ModifierExample
{
    //variable for empty address



    private static String status;

    @Callable
    public static String setString(String s1)
    {
        status = new String(s1);
        return status;

    }

    @Callable
    public static String getString()
    {
        Blockchain.println("The string is " + status);
        return status;
    }

}

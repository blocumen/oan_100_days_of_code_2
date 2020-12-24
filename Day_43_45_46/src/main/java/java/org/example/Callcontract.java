
 package java.org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import avm.Address;

import java.util.concurrent.BlockingDeque;

 public class Callcontract
{
    @Callable
    public static String  setstr (String s)
    {

        Address call = Blockchain.getCaller();

        //Blockchain.println("Contract Owener: ", call.toString());
        return call.toString();
    }


}

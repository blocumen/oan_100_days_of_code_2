package java.org.example;


import avm.Blockchain;
import avm.Address;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;


public class Day46assign
{

    public static Address a;

    //@Initializable
    public static Address x,y,z;

    @Callable
    public static void test()
    {
        Blockchain.println("Testing address methods");
    }

    @Callable
    public static void checkaddmethds ()
    {


        Blockchain.println("Address value x when using getaddress : " +  Blockchain.getAddress());


        Blockchain.println("Address value y when using getcaller : " +   Blockchain.getCaller());


        Blockchain.println("Address value z  when using getorigin : "   + Blockchain.getOrigin());

        //a07fb698d6a1c49ae4a5cfefb9eb6da52380d8e0796d6c9c65c73caf01e28f26
    }
    @Callable
    public static void check()
    {
        Blockchain.print("===========================Checking in the call function====================");
        checkaddmethds();
        Blockchain.println("Address value y when using getcaller : " +   Blockchain.getCaller());


        Blockchain.println("Address value z  when using getorigin : "   + Blockchain.getOrigin());


    }
}

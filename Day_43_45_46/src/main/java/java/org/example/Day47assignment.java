package java.org.example;

import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;
import avm.Blockchain;
import avm.Address;

public class Day47assignment
{

    private static AionList<String> addressbook = new AionList<>();
    //private static AionList<String> NameListCopy = new AionList<>();
   // private static AionList<String> NameSubList = new AionList<>();



    @Callable
    public static void addadr()
    {
            Address a = Blockchain.getAddress();
            addressbook.add(a.toString());
            Blockchain.println("Number of addresses after addition in the list : " + addressbook.size());

    }

    @Callable
    public static void remadr(Address a)
    {
            addressbook.remove(a);
        Blockchain.println(a.toString() +  " Removed from the list");

    }
}

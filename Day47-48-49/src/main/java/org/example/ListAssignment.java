package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;

public class ListAssignment {

    private static AionList<Address> myList = new AionList<Address>();

    @Callable
    public static int getCount() {
        return myList.size();
    }

    @Callable
    public static void putAddress() {
        if(!myList.contains(Blockchain.getCaller())) {
            myList.add(Blockchain.getCaller());
        }
    }

    @Callable
    public static void removeAddress() {
        if(!myList.contains(Blockchain.getCaller())) {
            myList.remove(Blockchain.getCaller());
        }
    }
}

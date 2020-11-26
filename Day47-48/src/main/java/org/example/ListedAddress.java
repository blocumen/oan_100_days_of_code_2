package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;

public class ListedAddress
{
    private static AionList<Address> addresses = new AionList<>();


    @Callable
    public static void add(){
        Address caller = Blockchain.getCaller();
        Blockchain.require(!addresses.contains(caller));
        addresses.add(caller);
        Blockchain.println("Address added :" +caller.toString() );
    }


    @Callable
    public static void remove(){
        Blockchain.require(!addresses.isEmpty());
        Address caller = Blockchain.getCaller();
        Blockchain.require(addresses.contains(caller));
        addresses.remove(caller);
        Blockchain.println("Address removed" +caller.toString());
    }
    @Callable
    public static void countAddress(){
        addresses.size();
        Blockchain.println("Size of list "+addresses.size());

    }


}
package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;

public class AddressList
{
    private static AionList<Address> addresses = new AionList<>();

    @Callable
    public static void addAddress(){
        Address callerAddress = Blockchain.getCaller();
        Blockchain.require(!addresses.contains(callerAddress));
        addresses.add(callerAddress);
        Blockchain.println("Address :" +callerAddress.toString() + " added succesfully");
    }

    @Callable
    public static int addressesCount(){
        return addresses.size();
    }

    @Callable
    public static void removeAddress(){
        Blockchain.require(!addresses.isEmpty());
        Address callerAddress = Blockchain.getCaller();
        Blockchain.require(addresses.contains(callerAddress));
        addresses.remove(callerAddress);
        Blockchain.println("Address" +callerAddress.toString() + "removed succesfully");
        Blockchain.println("The number of addresses present are "+addresses.size());
    }



}

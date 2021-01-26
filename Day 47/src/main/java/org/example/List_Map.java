package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;

public class List_Map {
    private static AionList<Address> AddressList = new AionList<>();
    @Callable
    public static void addAddress(Address newAddress) {
        AddressList.add(newAddress);
        Blockchain.println("Added address to list");
        Blockchain.println("Length of list "+AddressList.size());
    }
    @Callable
    public static void removeAddress(Address newAddress) {

        if(AddressList.contains(newAddress))
        AddressList.remove(newAddress);
        else Blockchain.println("Address not found");
        Blockchain.println("Length of list "+AddressList.size());

    }



}

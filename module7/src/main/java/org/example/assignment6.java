package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class assignment6 {
//    1. Deploy an Owner contract having an address variable named owner.
//    Deploy another contract with a method which would only increment count but only
//    allow owner address to do it.
    private static Address owner;

    static {
        owner = Blockchain.getCaller();
    }

    @Callable
    public static Address getOwner(){
        return owner;
    }
}

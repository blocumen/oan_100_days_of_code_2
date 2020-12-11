package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class assignment3 {
//    Write a smart contract which would only allow the deployer address to call a
//    methods. Define your own methods.

    private static Address Owner;

    static {
        Owner = Blockchain.getCaller();
    }

    private static void onlyOwner(){
        Blockchain.require(Owner.equals(Blockchain.getCaller()));
    }

    @Callable
    public static void fun1(){
        onlyOwner();
        Blockchain.println(Owner.toString());
    }

}

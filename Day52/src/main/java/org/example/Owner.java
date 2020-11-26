package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Owner
{
    private  static Address owner;

    @Callable
    public static Address getOwner(){
        owner = Blockchain.getCaller();
        return owner;
    }

}
package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Owner
{
    private  static Address owner;
    static {
        owner = Blockchain.getCaller();
    }

    @Callable
    public static Address getOwner(){

        return owner;
    }

}

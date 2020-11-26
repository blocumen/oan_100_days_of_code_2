package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class OwnerDeploy
{
    private static Address owner;
    static {
        owner = Blockchain.getCaller();
    }
    private static void Owner(){
        Blockchain.require(owner.equals(Blockchain.getCaller()));
    }
    @Callable
    public static void func1(){
        Owner();
        Blockchain.println("Smart Contract Called by Deployer");
    }
}
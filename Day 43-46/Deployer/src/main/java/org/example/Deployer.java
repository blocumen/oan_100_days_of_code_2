package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Deployer
{
    private static Address owner;
    static {
        owner = Blockchain.getCaller();
    }
    private static void onlyOwner(){
        Blockchain.require(owner.equals(Blockchain.getCaller()));
    }
    @Callable
    public static void func1(){
        onlyOwner();
        Blockchain.println("Deployer of this smart contract has called the function");
    }

    public static void validateDifferenceInRemainingEnergry() {
        long remainingEnergy = Blockchain.getRemainingEnergy();
        Blockchain.println("initial energy : "+remainingEnergy);
        int a = 100;
        int b = 20;
        int sum = a + b;
        Blockchain.println("remaining energy : "+Blockchain.getRemainingEnergy());
    }

}

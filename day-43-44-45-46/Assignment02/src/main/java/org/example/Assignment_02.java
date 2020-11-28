package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Assignment_02
{
    private static Address owner;
    private static String myStr = "Hello AVM";

    static {
        owner = Blockchain.getCaller();
    }

    @Callable
    public static String getString(){
        return myStr;
    }

    @Callable
    public static void setString(String newStr){
        onlyOwner();
        myStr = newStr;
    }

    private static void onlyOwner(){
        Blockchain.require(Blockchain.getCaller().equals(owner));
    }

    @Callable
    public static void validateDifferenceInRemainingEnergy(){
        long remainingEnergy = Blockchain.getRemainingEnergy();
        Blockchain.println("initial energy :" + remainingEnergy);
        int a = 100;
        int b = 200;
        int sum = a+b;
        Blockchain.println("remaining energy : "+ Blockchain.getRemainingEnergy());
    }
}

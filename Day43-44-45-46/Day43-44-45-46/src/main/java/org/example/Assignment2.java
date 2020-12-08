package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Assignment2 {

    private static final double TWO = 2;

    private static Address owner;

    static {
        owner = Blockchain.getCaller();
    }

    @Callable
    public static double powerOfTwo(double exponent) {
        onlyOwner();
        return compute(exponent);
    }

    private static double compute(double exponent) {
        double comp = 1;
        while (exponent > 0) {
            comp *= TWO;
            exponent--;
        }
        return comp;
    }

    private static void onlyOwner(){
        Blockchain.require(Blockchain.getCaller().equals(owner));
    }
}

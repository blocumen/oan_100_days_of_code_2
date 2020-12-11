package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class assignment2 {
/*
* 1. Create a smart contract class. Add an initializable variable called status and
provide a getter method that returns the value set during initialization.
* */
    @Initializable
    private static String status;

    @Callable
    public static String getter(){
        Blockchain.println(status);
        return status;
    }
}

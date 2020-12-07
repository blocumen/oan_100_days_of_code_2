package org.example;

import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class assignment2 {
    @Initializable
    private static String myString;

    @Callable
    public static String getter(){
        return myString;
    }
}

/*
* 1. Create a smart contract class. Add an initializable variable
* called status and provide a getter method that returns the value
* set during initialization.
*
* While deploy Aion VM >> should pass argument {-T "<value>"}
* */

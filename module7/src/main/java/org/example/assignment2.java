package org.example;

import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class assignment2 {
    @Initializable
    private static String myString = "Test message";

    @Callable
    public static String getter(){
        return myString;
    }
}

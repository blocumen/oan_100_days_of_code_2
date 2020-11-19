package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class HelloAvm
{
    private static int myInt = 45;



    @Callable
    public static int getString() {
        Blockchain.println("Current Number is " + myInt);
        return myInt;
    }

    @Callable
    public static int setString(int newInt) {
        myInt = newInt;
        myInt = myInt * 10 ;
        return myInt;

    }

}

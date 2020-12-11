package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class assignment1 {
//    1. Write a method that would multiple a number by 10 and return the value.

    @Callable
    public static int mul(int num){
        return num * 10;
    }
}

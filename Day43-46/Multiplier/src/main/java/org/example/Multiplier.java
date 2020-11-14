package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Multiplier
{
    @Callable
    public static int multiplyByTen(int input){
        return input * 10;
    }
}

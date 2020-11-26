package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class ReturnerExample
{
    @Callable
    public static String getString(int index){
        String[] myStr = {"Hello AVM!", "AVM is great!"};
        return myStr[index];
    }
}

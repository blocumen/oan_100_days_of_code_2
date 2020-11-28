package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class HelloAvm_SC
{


    @Initializable
    private static String myString;

    @Callable
    public static String name()
    {

        return myString;
    }



}

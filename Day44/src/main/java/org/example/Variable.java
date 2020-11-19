package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class Variable
{
    @Initializable
    public static boolean status;


    @Callable
    public static  boolean getStatus() {
        Blockchain.println("Status  : " + status);
        return status;
    }


}

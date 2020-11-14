package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class StatusDemo
{
    @Initializable
    private static String status;

    @Callable
    public static String getStatus() {
        Blockchain.println("Current status is " + status);
        return status;
    }
}

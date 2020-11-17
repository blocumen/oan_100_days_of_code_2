/*
    Module 7 - Day 45
    Initializing variables while deploying contract(Initializable fields)

    Create a smart contract class. Add an initializable variable called status and provide a getter method
    that returns the value set during initialization.
 */
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

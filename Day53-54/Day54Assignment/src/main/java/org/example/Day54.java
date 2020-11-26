/*
    Module 7 - Day 54
    Initializing variables while deploying contract

    Write a smart contract which would take 2-arguments while deployment.
    It would accept one integer and one string argument. Set the deployment arguments to different variables.
 */
package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class Day54
{
    @Initializable
    private static int rollNo;

    @Initializable
    private static String name;

    @Callable
    public static int getRollNo(){
        Blockchain.println("RollNo: " + rollNo);
        return rollNo;
    }

    @Callable
    public static String getName(){
        Blockchain.println("Name: " + name);
        return name;
    }
}

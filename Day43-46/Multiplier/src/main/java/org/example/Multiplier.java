/*
    Module 7 - Day 43,44
    Callable functions

    Write a method that would multiple a number by 10 and return the value.
 */
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

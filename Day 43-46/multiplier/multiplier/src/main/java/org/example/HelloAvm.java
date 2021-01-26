package org.example;

import org.aion.avm.tooling.abi.Callable;

public class HelloAvm
{
    @Callable
    public static int mulby10(int num) {
        return num*10;
    }
    @Callable
    public static int divby10(int num) {
        return num/10;
    }
}

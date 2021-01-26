package org.example;

import org.aion.avm.tooling.abi.Callable;

public class multiplier {
    @Callable
    public static int mulby10(int num) {
        return num*10;
    }
}

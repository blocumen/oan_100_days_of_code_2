package org.example;

import org.aion.avm.tooling.abi.Callable;

public class assignment1 {
    private static final Integer X = 0;

    @Callable
    public static int mul(int y) {
        return y * 10;
    }
}

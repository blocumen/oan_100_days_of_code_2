package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;


public class Contract2 {
    @Callable
    public static void hello(){
        Blockchain.println("Hello world");
    }
}

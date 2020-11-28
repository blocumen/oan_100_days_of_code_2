package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;





public class NewAvm {



    @Callable
    public static int Mul(int val) {
         int num = val * 10;
        //Blockchain.println(String.valueOf(num));
        return num;
        }
    @Callable
    public static void sayHello() {
        Blockchain.println("Hello Avm");
    }

}

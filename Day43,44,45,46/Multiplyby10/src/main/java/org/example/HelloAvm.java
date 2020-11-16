package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class HelloAvm
{
    private static String myStr = "Hello AVM";

    @Callable
    public static void sayHello() {
        Blockchain.println("Hello Avm");
    }

    @Callable
    public static float multiplyby10(float a){
        return a*10;
    }

//    @Callable
//    public static double multiplyby10(double a){
//        return a*10;
//    }
//polymorphism is not working , 2 or more function with same name is not working

}

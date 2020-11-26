package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class HelloAvm
{
    private static String myStr = "Hello AVM";

    @Initializable
    private static int myInt;

    @Initializable
    private static String myString;


    @Callable
    public static void sayHello() {
        Blockchain.println("Hello Avm");
    }

    @Callable
    public static String greet(String name) {
        return "Hello " + name;
    }

    @Callable
    public static String getString() {
        Blockchain.println("Current string is " + myStr);
        return myStr;
    }

    @Callable
    public static void setString(String newStr) {
        myStr = newStr;
        Blockchain.println("New string is " + myStr);
    }

    @Callable
    public static int getResult(int number) {
        return (number*10);
    }
/*
    static {
        ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
        myInt = decoder.decodeOneInteger();
        myString = decoder.decodeOneString();
    }

 */

}



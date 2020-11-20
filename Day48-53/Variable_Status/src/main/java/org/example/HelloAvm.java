package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class HelloAvm
{
    private static String myStr = "Hello AVM";

    public static void sayHello() {
        Blockchain.println("Hello Avm");
    }

    public static String greet(String name) {
        return "Hello " + name;
    }

    public static String getString() {
        Blockchain.println("Current string is " + myStr);
        return myStr;
    }

    public static void setString(String newStr) {
        myStr = newStr;
        Blockchain.println("New string is " + myStr);
    }

}

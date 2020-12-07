package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class HelloAvm {
    @Initializable
    private static String myString;
    private static String myStr = "Hello AVM";

    static {
        logMyString("MyStringInitialization");
    }

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
    public static String Greet(String name) {
        return "Hello " + name;
    }

    @Callable
    public static void logMyString(String topic) {
        Blockchain.log(topic.getBytes(),
                Blockchain.getCaller().toByteArray(), myStr.getBytes());
    }

}

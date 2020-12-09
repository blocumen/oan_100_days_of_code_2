package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class HelloAvm {
//    private static String myString = "test";
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

//    @Callable
//    public static void getBlockNumber(String newStr) {
//        Blockchain.println("Block number to be mined: ");
//        Blockchain.println(Long.toString(Blockchain.getBlockNumber()));
////        return Blockchain.getBlockNumber();
//    }
}

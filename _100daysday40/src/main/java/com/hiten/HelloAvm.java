package com.hiten;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;
import org.aion.avm.userlib.abi.ABIDecoder;

public class HelloAvm
{

    @Initializable
    private static String myString;

    @Initializable
    private static int myInt;

    private static Address owner;
    private static String myStr = "Hello AVM";

    static {
        ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
        myString = decoder.decodeOneString();
        myInt = decoder.decodeOneInteger();
        owner = Blockchain.getCaller();
    }

    @Callable
    public static void myStringReturn() {
        Blockchain.println("myString: " + myString);
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
    public static int multiplyBy10(int number) {
        return number*10;
    }

    @Callable
    public static String getString() {
        onlyOwner();
        Blockchain.println("Current string is " + myStr);
        return myStr;
    }

    @Callable
    public static void setString(String newStr) {
        myStr = newStr;
        Blockchain.println("New string is " + myStr);
    }

    // Check if the current caller of a function matches the owner address.
    private static void onlyOwner() {
        Blockchain.require(Blockchain.getCaller().equals(owner));
    }

}

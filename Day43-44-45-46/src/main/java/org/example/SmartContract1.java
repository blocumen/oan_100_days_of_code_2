package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class SmartContract1
{
    private static String myStr = "Hello AVM";

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

    // method to multiply a number by 10(assignment 1)
    @Callable
    public static int intoTen(int number) {
        return (number*10);
    }
    @Initializable
    public static String status;

    // assingnment 2
    @Callable
    public static void setStatus(String newStatus) {
        status = newStatus;
        Blockchain.println("New status is " + status);
    }

    @Callable
    public static String getStatus() {
        return status;
    }

    @Callable
    public static void setMessage(String name) {
        Blockchain.println("Hello " + name);
    }

    @Callable
    public static String setNewString(String newStr) {
        Address eventCaller = Blockchain.getCaller();
        Blockchain.println("Event caller : " +  eventCaller.toString());
        return eventCaller.toString();
    }

    //assignment 3
    private static Address owner;
    private static String myString = "Hello AVM";
    static {
        owner = Blockchain.getCaller();
    }

    @Callable
    public static String get2String() {
        return myString;
    }

    @Callable
    public static void set2String(String newString) {
        onlyOwner();
        myString = newString;
    }

    private static void onlyOwner() {
        Blockchain.require(Blockchain.getCaller().equals(owner));

    }



}

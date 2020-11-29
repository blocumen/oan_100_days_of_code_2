package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;
import avm.Address;

public class SmartContract {
    private static String myStr = "Hello AVM";

    @Initializable
    private static boolean status;

    @Callable
    public static int getResult(int number) {
        int result;
        result = number * 10;
        return (result);
    }

    @Callable

    public static boolean getStatus() {
        return (status);
    }

    //Call contract methods
    static {
        logMyString("Sooda");
    }

    //Emit Event
    @Callable
    public static void logMyString(String topic) {
        Blockchain.log(topic.getBytes(), Blockchain.getCaller().toByteArray());
        Blockchain.println("Hello World!");
    }

    //Address of caller account
    @Callable
    public static String setString(String newStr) {
        Address eventCaller = Blockchain.getCaller();
        Blockchain.println("Event caller:" + eventCaller.toString());
        return eventCaller.toString();
    }
}// end ModifierExample class
/*
Successful
[INFO] Arguments        : -T '"New Hello!'
[INFO] Calling contract method ...
Output from transaction 0000000000000000000000000000000000000000000000000000000000000000
Event caller:a05810ca5772fc7a7a8f14b1aa02407a7c1e9fdb17507866294d81d0f19bea3e
 */


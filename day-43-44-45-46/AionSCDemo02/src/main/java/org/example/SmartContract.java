package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class SmartContract {
    private static String myStr;

    @Callable
    public static void setMsg(String name) {
        Blockchain.println("Good Morning " + name);
    }

    @Callable
    public static String setString(String newStr) {
        Address eventCaller = Blockchain.getCaller();
        Blockchain.println("Event caller: " + eventCaller.toString());
        return eventCaller.toString();
    }
}

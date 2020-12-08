package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;

public class Assignment {

    @Initializable
    private static String status;

    private static String myStr;

    public Assignment(String status) {
        this.status = status;
    }

    @Callable
    public static String getStatus() {
        return status;
    }

    public static void setMsg(String msg) {
        Blockchain.println("Good Morning " + msg );
    }

    @Callable
    public static String setString(String str) {
        Address evt = Blockchain.getCaller();
        myStr = str;
        Blockchain.println("Caller of this method is: " + evt.toString());
        return evt.toString();
    }
}

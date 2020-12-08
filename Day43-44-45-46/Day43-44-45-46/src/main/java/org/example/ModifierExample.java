package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import avm.Address;
public class ModifierExample {
    // Create an empty address variable.
    private static Address owner;
    private static String myStr = "Hello AVM";
    static {
        // Set the owner of this contract as the address that deployed it. This cannot be altered.
        owner = Blockchain.getCaller();
    }

    @Callable
    public static String getString() {
        return myStr;
    }
    @Callable
    public static void setString(String newStr) {
        onlyOwner();
        Blockchain.println("Coming Here!");
        myStr = newStr;
    }
    // Check if the current caller of a function matches the owner address.
    private static void onlyOwner() {
        Blockchain.require(Blockchain.getCaller().equals(owner));
    }
}

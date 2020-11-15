package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Deployer
{
    private static Address owner;
    private static String myStr = "Hello AVM";

    static {
        // Set the owner of this contract as the address that deployed it. This cannot be altered.
        owner = Blockchain.getCaller();
    }

    // Check if the current caller of a function matches the owner address.
    private static void onlyOwner() {
        Blockchain.require(Blockchain.getCaller().equals(owner));
    }

    @Callable
    public static String getString() {
        return myStr;
    }

    @Callable
    public static void setString(String newStr) {   // Only the deployer account can call this method
        onlyOwner();
        Blockchain.println("Initial energy: " + Blockchain.getRemainingEnergy());
        myStr = newStr;
        Blockchain.println("Remaining energy: " + Blockchain.getRemainingEnergy());
    }

    @Callable
    public static int sum(int a, int b) {
        return a + b;
    }

    @Callable
    public static int mult(int a, int b) {
        return a * b;
    }
}

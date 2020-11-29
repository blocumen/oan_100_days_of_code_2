package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

//Blockchain.require() with checks
public class ModifierExample {
    public static Address owner;
    private static String myStr = " ";

    static {
        owner= Blockchain.getCaller();
    }//end getCaller

    @Callable
    public static String getString() {
        return myStr;
    }//end get

    @Callable
    public static void setString(String newStr) {
        onlyOwner();
        myStr = newStr;
    } //set string

    // Check if the current caller of a function matches the owner address.
    private static void onlyOwner() {
        Blockchain.require(Blockchain.getCaller().equals(owner));
    } //end only owner

} //end class

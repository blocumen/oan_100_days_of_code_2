/*
    Module 7 - Day 49
    AionMap Assignment

    Write a basic contract which would assign some fixed number(tokens) to a new address.
    Create balances mapping to maintain the addresses which are already assigned the value.
    There will be a Callable function called AssignTokens(number) which would assign fixed tokens or number.
    If an existing address is called the method, it would revert.
 */
package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionMap;

public class AssignTokens
{
    private static Address owner;
    private static AionMap<Address, Float> accounts = new AionMap();

    static {
        owner = Blockchain.getCaller();
    }

    private static void onlyOwner(){
        Blockchain.require(owner.equals(Blockchain.getCaller()));
    }

    @Callable
    public static void assignTokens(float amount){
        Address caller = Blockchain.getCaller();
        Blockchain.require(!accounts.containsKey(caller));
        accounts.put(caller, amount);
        Blockchain.println("Address " + caller.toString() + " has been assigned " + amount + " tokens!");
    }

    @Callable
    public static float checkBalance(){
        Address caller = Blockchain.getCaller();
        Blockchain.println("Your balance is " + accounts.get(caller) + " tokens!");
        return accounts.get(caller);
    }

    @Callable
    public static void listAccounts(){
        onlyOwner();
        if(accounts.isEmpty()){
            Blockchain.println("Ledger is empty!");
        }
        else {
            Blockchain.println("List of accounts - ");
            for(Address current: accounts.keySet()){
                Blockchain.println(current + " : " + accounts.get(current));
            }
        }
    }
}

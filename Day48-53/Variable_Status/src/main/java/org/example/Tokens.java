package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionMap;

public class Tokens
{
    private static AionMap<Address,Integer>balances = new AionMap<>();

    @Callable
    public static void AssignTokens(int tokens){
        Address caller = Blockchain.getCaller();
        Blockchain.require(!balances.containsKey(caller));
        balances.put(caller,tokens);
    }

    @Callable
    public static void checkBalance(){
        Address caller = Blockchain.getCaller();
        Blockchain.println("Account: " +caller.toString()+" Contains "+balances.get(caller));
    }

}

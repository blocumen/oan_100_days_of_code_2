package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionMap;

public class MapAssignment {

    private static AionMap<Address, Integer> myMap = new AionMap<Address, Integer>();

    @Callable
    public static void assignTokens(int tokens) {
        if(!myMap.containsKey(Blockchain.getCaller())) {
            myMap.put(Blockchain.getCaller(), tokens);
        }
        else {
            Blockchain.revert();
        }
    }
}

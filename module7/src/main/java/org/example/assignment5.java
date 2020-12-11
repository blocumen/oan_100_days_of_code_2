package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionMap;

public class assignment5 {
//    Write a basic contract which would assign some fixed number(tokens) to a new
//    address. Create balances mapping to maintain the addresses
//    which are already
//    assigned the value. There will be a Callable function called
//    AssignTokens(number) which would assign fixed tokens or number. If an existing
//    address is called the method, it would revert.

    private static final AionMap<Address, Integer> balance =
            new AionMap<>();

    @Callable
    public static void AssignTokens(Address add, int num){
//      address exists, method reverts.
        Blockchain.require(balance.containsKey(add));
        balance.put(add, num);
    }
}

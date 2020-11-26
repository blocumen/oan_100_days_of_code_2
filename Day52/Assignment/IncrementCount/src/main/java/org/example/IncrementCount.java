/*
    Module 7 - Day 52
    Contract to contract calls

    Deploy an Owner contract having an address variable named owner.
    Deploy another contract with a method which would only increment count but only allow owner address to do it.
 */
package org.example;

import avm.Address;
import avm.Blockchain;
import avm.Result;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;
import org.aion.avm.userlib.abi.ABIStreamingEncoder;

import java.math.BigInteger;

public class IncrementCount
{
    private static int count = 0;

    @Callable
    public static int getCount(){
        return count;
    }

    @Callable
    public static void increment(Address contractAddress){
        ABIStreamingEncoder encoder = new ABIStreamingEncoder();
        byte[] data = encoder.encodeOneString("getOwner").toBytes();
        Result result = Blockchain.call(contractAddress, BigInteger.ZERO, data, Blockchain.getRemainingEnergy());

        ABIDecoder decoder = new ABIDecoder(result.getReturnData());
        Address owner = decoder.decodeOneAddress();
        Blockchain.require(owner.equals(Blockchain.getCaller()));

        count++;
        Blockchain.println("Caller address: " + Blockchain.getCaller());
        Blockchain.println("Contract owner address: " + owner);
        Blockchain.println("Count: " + count);
    }
}

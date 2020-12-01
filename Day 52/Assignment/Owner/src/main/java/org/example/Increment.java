package org.example;

import avm.Address;
import avm.Blockchain;
import avm.Result;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;
import org.aion.avm.userlib.abi.ABIStreamingEncoder;

import java.math.BigInteger;

public class Increment {

    private static int count=0;

    @Callable
    public static void incrementCount(Address contractAddress){
        ABIStreamingEncoder encoder = new ABIStreamingEncoder();
        byte[] data = encoder.encodeOneString("getOwner").toBytes();
        Result result= Blockchain.call(contractAddress, BigInteger.ZERO,data,Blockchain.getRemainingEnergy());
        ABIDecoder decoder = new ABIDecoder(result.getReturnData());
        Address ownerAddress = decoder.decodeOneAddress();
        Blockchain.require(ownerAddress.equals(Blockchain.getCaller()));
        count++;
        Blockchain.println("The owner address is "+ownerAddress);
        Blockchain.println("The caller address is "+ Blockchain.getCaller());
        Blockchain.println("The Count after Increment is "+count);
    }

    @Callable
    public static int getCount() {
        return count;
    }
}

package org.example;

import avm.Address;
import avm.Blockchain;
import avm.Result;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;
import org.aion.avm.userlib.abi.ABIStreamingEncoder;

import java.math.BigInteger;

public class Caller
{
    private static final Address returnerContractAddress;

    static {
        ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
        returnerContractAddress = decoder.decodeOneAddress(); //Set the contract address that you want to call
    }

    @Callable
    public static Address getReturnerContractAddress() {
        return returnerContractAddress;
    }

    @Callable
    public static String getStringInAnotherContract(int index) {
        Blockchain.println("Before encoder");
        ABIStreamingEncoder encoder = new ABIStreamingEncoder();
        Blockchain.println("Before data initialization");
        byte[] data = encoder.encodeOneString("getString")
                .encodeOneInteger(index)
                .toBytes();
        Blockchain.println("Before contract call");
        Result getString = Blockchain.call(returnerContractAddress, BigInteger.ZERO, data, Blockchain.getRemainingEnergy());
        Blockchain.println("Before decoder");
        ABIDecoder decoder = new ABIDecoder(getString.getReturnData());
        Blockchain.println("Before string assignment");
        String myString = decoder.decodeOneString().toString();
        return myString;
    }
}

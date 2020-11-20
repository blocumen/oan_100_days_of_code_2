package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import avm.Address;
import avm.Result;
import org.aion.avm.userlib.abi.ABIDecoder;
import org.aion.avm.userlib.abi.ABIEncoder;
import org.aion.avm.userlib.abi.ABIStreamingEncoder;

import java.math.BigInteger;

public class Caller
{

    private static Address returnerContractAddress;

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
        ABIStreamingEncoder encoder = new ABIStreamingEncoder();
        byte[] data = encoder.encodeOneString("getString")
                .encodeOneInteger(index)
                .toBytes();
        Result getString = Blockchain.call(returnerContractAddress, BigInteger.ZERO, data, Blockchain.getRemainingEnergy());
        ABIDecoder decoder = new ABIDecoder(getString.getReturnData());
        String myString = decoder.decodeOneString().toString();
        return myString;
    }

}

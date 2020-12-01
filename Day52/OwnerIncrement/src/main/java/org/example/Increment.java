package org.example;

import avm.Address;
import avm.Blockchain;
import avm.Result;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;
import org.aion.avm.userlib.abi.ABIStreamingEncoder;

import java.math.BigInteger;

// Reference: https://developer.theoan.com/docs/custom-kits/fundamentals/writing-contracts/contract-to-contract
//0b2260914e069f3c38e1974bbdf0b7d7cfa3ecaf08622f917bed06f5d06cc194  is the contract address from SC Increment
public class Increment {
    private static int cnt=0;

    @Callable
    public static void incrementCnt(Address contractAddress){
        byte[] encodedData = new byte[100];
        ABIStreamingEncoder encoder = new ABIStreamingEncoder(encodedData);
        byte[] data = encoder.encodeOneString("getOwner").toBytes();
        Result getString = Blockchain.call(contractAddress, BigInteger.ZERO, data, Blockchain.getRemainingEnergy());
        ABIDecoder decoder = new ABIDecoder(getString.getReturnData());
        Address ownerAddress = decoder.decodeOneAddress();
        Address callerAddress = Blockchain.getCaller();
        Blockchain.require(ownerAddress.equals(callerAddress));
        cnt++;

        Blockchain.println("Owner is: " + ownerAddress);
        Blockchain.println("Caller is: " + callerAddress);
        Blockchain.println("Count increment is: " + cnt);
    }
}

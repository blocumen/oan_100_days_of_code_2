package org.example;

import avm.Address;
import avm.Blockchain;
import avm.Result;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;
import org.aion.avm.userlib.abi.ABIStreamingEncoder;

import java.math.BigInteger;

public class Increment
{
   private static int count=0;

   @Callable
    public static void incrementCount(Address contractAddress){
       ABIStreamingEncoder encoder = new ABIStreamingEncoder();
       byte[] data = encoder.encodeOneString("getOwner").toBytes();
       Result result= Blockchain.call(contractAddress, BigInteger.ZERO,data,Blockchain.getRemainingEnergy());
       ABIDecoder ownerAddress = new ABIDecoder(result.getReturnData());
       ownerAddress.equals(Blockchain.getCaller());
       count++;
       Blockchain.println("The Count after Increment is "+count);
   }

   @Callable
    public static int getCount() {
        return count;
    }
}

package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import avm.Address;
import org.aion.avm.userlib.abi.ABIDecoder;
import avm.Result;
import org.aion.avm.userlib.abi.ABIEncoder;
import org.aion.avm.userlib.abi.ABIStreamingEncoder;
import java.math.BigInteger;

public class CounterIncrement
{
    public static int cnt =0;
    public static Address addr;

    @Callable
    public static void Counter()
    {
        checkowner();
        ABIStreamingEncoder encoder = new ABIStreamingEncoder();
        byte[] data = encoder.encodeOneInteger(cnt)
                .toBytes();
        Result getString = Blockchain.call(addr, BigInteger.ZERO, data, Blockchain.getRemainingEnergy());
        ABIDecoder decoder = new ABIDecoder(getString.getReturnData());
        cnt++;
        Blockchain.println("The owner address is "+ addr);
        Blockchain.println("The caller address is "+ Blockchain.getCaller());
        Blockchain.println("Counter value is : " + cnt );
    }

    @Callable
    public static void checkowner()
    {
        ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
        addr = decoder.decodeOneAddress(); //Set the owner address
        Blockchain.require(Blockchain.getCaller().equals(addr));
    }
}

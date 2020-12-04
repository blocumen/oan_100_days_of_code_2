package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;

public class HelloAvm
{
    private static String make;
    private static int year;

    //ABIDecoder is a utility class for decoding transaction data as high-level ABI types. This class contains static methods for parsing transaction data.
    static {
        ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
        make = decoder.decodeOneString();
        year = decoder.decodeOneInteger();
    }

    @Callable
    public static String getMake() {
        return make;
    }

    @Callable
    public static int getYear() {
        return year;
    }
}
//Deploy paras: -T Fiat -I 2014
//Successful
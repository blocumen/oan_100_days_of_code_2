package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;

public class HelloAvm
{
    private static String myStr;
    private static int myInteger;

    //ABIDecoder is a utility class for decoding transaction data as high-level ABI types. This class contains static methods for parsing transaction data.
    static {
        ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
        myStr = decoder.decodeOneString();
        year = decoder.decodeOneInteger();
    }

    @Callable
    public static String getMyStr() {
        return myStr;
    }

    @Callable
    public static int getMyInteger() {
        return myInteger;
    }
}

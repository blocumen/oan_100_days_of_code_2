package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;
import org.aion.avm.userlib.abi.ABIDecoder;

public class HelloAvm
{
    @Initializable
    private static String s;

    @Initializable
    private static int i;

    @Callable
    public static String getString(String s1)
    {
        s=s1;
        ABIDecoder dec = new ABIDecoder(Blockchain.getData());
        s=dec.decodeOneString();
        return s;

    }

    @Callable
    public static int getint(int i1)
    {
        i=i1;
        ABIDecoder dec = new ABIDecoder(Blockchain.getData());
        i=dec.decodeOneInteger();
        return i;

    }


}

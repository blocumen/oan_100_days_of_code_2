package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;

public class HelloAvm
{
    private static int num;
    private static String str;
   static {
       ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
       num = decoder.decodeOneInteger();
       str = decoder.decodeOneString();
   }
   @Callable
   public static int getintvariable(){
       return num;
   }
   @Callable
    public static String getStringvariable(){
       return str;
   }



}

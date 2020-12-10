package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Deployer
{
    private static Address owner;
   static {
       owner = Blockchain.getCaller();
   }
   private static void onlyOwner(){
       Blockchain.require(owner.equals(Blockchain.getCaller()));
   }
   @Callable
   public static void func1(){
       onlyOwner();
       Blockchain.println("Deployer of this smart contract has called the function");
   }
   @Callable
    public static void fun2(){

   }
}

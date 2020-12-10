package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class HelloAvm
{
    private static Address owner ;
   static {

        owner = Blockchain.getCaller();
   }
   private  static void onlyOwner(){
       Blockchain.require(Blockchain.getCaller().equals(owner));
   }



   @Callable
   public static void checkOwnercalled(){
       onlyOwner();
       Blockchain.println("func called ");
   }

    @Callable
    public  static void addressOffuncCaller(){

        Address functioncaller = Blockchain.getCaller();
        Blockchain.println("function caller is "+functioncaller.toString());
    }

    @Callable
    public static void calculateGasofFunc(){
       long initialGas = Blockchain.getRemainingEnergy();
       Blockchain.println("intial energy "+initialGas);
       int res = 5+23;
       Blockchain.println("Remaining energy is :"+Blockchain.getRemainingEnergy());

    }
    @Callable
    public static void getCode(Address address){
       Blockchain.println("The code size is "+ String.valueOf(Blockchain.getCodeSize(address)));
    }

    @Callable
    public static void emitEvent() {
        String eventTopic = "Emit Event"; // topic
        Address eventCaller = Blockchain.getCaller(); // data
        Blockchain.log(eventTopic.getBytes(), eventCaller.toByteArray());
    }
    @Callable
    public static long getBlockNumber(String newStr) {
        Blockchain.println("Block number to be mined: "+Blockchain.getBlockNumber());
        return Blockchain.getBlockNumber();
    }

    @Callable
    public static void getCallerAddress() {
        Blockchain.println("func caller is "+Blockchain.getCaller());
    }

}

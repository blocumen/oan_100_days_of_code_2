package org.example;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import avm.Address;

public class EventExample {
    @Callable
    public static void emiEvent(){
        String eventTopic = "Emit Event";
        Address eventCaller = Blockchain.getCaller();
        Blockchain.log(eventTopic.getBytes(), eventCaller.toByteArray());

    }
}

package org.example;

import avm.Address;
import avm.Blockchain;

public class EventLogExample {
    public static void emitEvent() {
        String eventTopic = "Emit Event";
        Address eventCaller = Blockchain.getCaller();
        Blockchain.log(eventTopic.getBytes(), eventCaller.toByteArray());
    }
}

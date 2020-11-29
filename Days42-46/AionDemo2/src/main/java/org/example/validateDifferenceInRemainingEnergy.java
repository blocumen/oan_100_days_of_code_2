package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class validateDifferenceInRemainingEnergy {
    @Callable
    public static  long emitEvent() {
        long remainingEnergy = Blockchain.getRemainingEnergy();
        Blockchain.println("initial energy : " + remainingEnergy);
        int a = 100;
        int b = 20;
        int sum = a + b;
        Blockchain.println("remaining energy : " + Blockchain.getRemainingEnergy());
        return remainingEnergy;
    } // end emitEvent()

}//Deployed successfully
//Method call successful:  Energy used: 39380

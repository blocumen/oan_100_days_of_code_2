package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class validateDifferenceInRemainingEnergy {
    @Callable
    public static void emitEvent() {
        long remainingEnergy = Blockchain.getRemainingEnergy();
        Blockchain.println("initial energy : " + remainingEnergy);
        int a = 100;
        int b = 20;
        int sum = a + b;
        Blockchain.println("remaining energy : " + Blockchain.getRemainingEnergy());
    } // end emitEvent()

}//Deployed successfully
//Function test failed
//Failed to execute goal org.aion4j:aion4j-maven-plugin:1.0.0:call (default-cli) on project AionDemo2: Method call failed

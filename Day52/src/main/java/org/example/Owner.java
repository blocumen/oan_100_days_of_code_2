package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import avm.Address;


    public class Owner
    {
        private static Address owner;
        static{
            owner = Blockchain.getCaller();
        }//fixed: 0b2260914e069f3c38e1974bbdf0b7d7cfa3ecaf08622f917bed06f5d06cc194

        @Callable
        public static Address getOwnerAddress() {
            Blockchain.println("Address is: " + owner); // prints above address
            return owner;
        }

    }





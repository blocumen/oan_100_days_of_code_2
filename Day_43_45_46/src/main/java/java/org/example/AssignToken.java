package java.org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionMap;


public class AssignToken
{


        private static Address owner;
        private static AionMap<Address, Float> accounts = new AionMap();

        static
        {
            owner = Blockchain.getCaller();
        }

        private static boolean onlyOwner()
        {
            boolean b = owner.equals(Blockchain.getCaller());
            return b;
        }

        @Callable
        public static void assignTokens(float amount)
        {
            Address caller = Blockchain.getCaller();
            Blockchain.require(!accounts.containsKey(caller));
            accounts.put(caller, amount);
            Blockchain.println("Address " + caller.toString() + " has been assigned " + amount + " tokens!");
        }

        @Callable
        public static float checkBalance()
        {
            Address caller = Blockchain.getCaller();
            Blockchain.println("Your balance is " + accounts.get(caller) + " tokens!");
            return accounts.get(caller);
        }

        @Callable
        public static void listAccounts()
        {
            boolean x = onlyOwner();
            if (x == true)
            {
                Blockchain.println("Enter token amount: ");
                 
                if(accounts.isEmpty())
                {
                    Blockchain.println("Ledger is empty!");
                }
                else
                    {
                    Blockchain.println("List of accounts - ");
                    for(Address current: accounts.keySet())
                    {
                        Blockchain.println(current + " : " + accounts.get(current));
                    }
                }
            }


        }
    }


package java.org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class Day43assign3
{
       @Callable
        public static String setString(String newStr)
        {
            Address eventCaller = Blockchain.getCaller();
            Blockchain.print("Caller Address " + eventCaller.toString());
            return eventCaller.toString();
        }
        @Callable
        public static void validateDifferenceInRemainingEnergry()
        {
        long rem = Blockchain.getRemainingEnergy();
        Blockchain.println("Initial Energy: "+ rem);
        int a = 100;
        int b = 20;
        int sum = a + b;
        Blockchain.println("Energy Limit : "+ Blockchain.getEnergyLimit());
        Blockchain.println("Energy Price : "+ Blockchain.getEnergyPrice());
        long updaterem = Blockchain.getRemainingEnergy();
        Blockchain.println("Remaining Energy : " + updaterem);
        Blockchain.println("Energy utilized in operation : " + (rem - updaterem));
        int m = (a*b/100) * 60;
        Blockchain.println("Updated remaining Energy : " + Blockchain.getRemainingEnergy());
        }

        @Callable
        public static int codadd()
        {
         Address a = Blockchain.getAddress();
         return Blockchain.getCodeSize(a);
        }

        @Callable
     public static void Log()
        {
           String eventTopic = "Emit Event"; // topic
           Address eventCaller = Blockchain.getCaller(); // data
           Blockchain.log(eventTopic.getBytes(), eventCaller.toByteArray());
        }

        @Callable
    public static long getBlockNumber(String newStr)
        {
        Blockchain.println("Block number to be mined: "); //+ Blockchain.getBlockNumber());
        return Blockchain.getBlockNumber();
        }

        @Callable
    public static Address getCallerAddress()
        {
            return Blockchain.getCaller();
        }





}





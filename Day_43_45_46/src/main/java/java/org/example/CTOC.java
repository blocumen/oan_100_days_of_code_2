package java.org.example;


import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;

public class CTOC
{

        @Callable
        public static String getString(int index)
        {
            String[] myStr = { "Hello AVM!", "AVM is great" };
            return myStr[index];

        }
}

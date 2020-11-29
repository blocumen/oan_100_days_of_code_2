package aion;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;

public class AionLIsts {
//Create list
    private static AionList<String> carList = new AionList<>();
    private static AionList<String> carListCopy = new AionList<>();
    private static AionList<String> carSubList = new AionList<>();

    private static AionList<Address> addresses = new AionList<>();

    @Callable
    public static void addAddresses(){
        addresses.add(Blockchain.getCaller());
    }

    @Callable
    public static void checkAddress() {
        Blockchain.require(addresses.contains(Blockchain.getCaller()));
        addresses.remove(Blockchain.getCaller());
    }
//a07b859610f45c44cf9cb4cbead773aadb880962e192b1d1afdfeb53742d68db
}//end class

package org.example;


import avm.Address;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;
import org.aion.avm.userlib.AionMap;
import java.util.Set;

public class AddressLedger {
    private static AionList<Address> AddressList = new AionList<Address>();

    @Callable
    public static void addAddress(Address newAddress) {
        AddressList.add(newAddress);
    }

    @Callable
    public static boolean checkAddress(Address address) {
        return AddressList.contains(address);
    }

    @Callable
    public static void removeAddress(Address address) {
        AddressList.remove(address);
    }

    @Callable
    public static int getSize() {
        return AddressList.size();
    }

    private static final AionMap<Address, Integer> balances = new AionMap<>();

    @Callable
    public static void assignTokens(Address newAddress, int tokens) {
        balances.put(newAddress, tokens);

    }
    @Callable
    public static int getBalance(Address address) {
        return balances.get(address);
    }

    @Callable
    public static String getBalances() {
        Set<Address> addresses = balances.keySet();
        String returnString = "\n";
// Loop through each car based on their ID.
        for (Address id : addresses) {
            Integer balanceInAccount = balances.get(id);


// Add the car details to a String.
            returnString = returnString + "Account in the balance with address: " + id + " is " + balanceInAccount + "\n";
        }
        return returnString;
    }

}



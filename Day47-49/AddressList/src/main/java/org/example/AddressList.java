/*
    Module 7 - Day 47
    List of Addresses

    Create a contract which has two methods to add new public addresses to the list, check if the address exists
    and remove from the list. Also, it gives the total count of addresses in the list.
 */
package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;

public class AddressList
{
    private static AionList<Address> addressList = new AionList<>();

    private static boolean addressPresent(Address address){
        if(addressList.contains(address)){
            Blockchain.println("Address is present in list!");
            return true;
        }
        else {
            Blockchain.println("Address is not present in list!");
            return false;
        }
    }

    @Callable
    public static void addAddress(){
        Address caller = Blockchain.getCaller();
        Blockchain.require(!addressPresent(caller));
        addressList.add(caller);
        Blockchain.println("Address: " + caller.toString() + " added to the list!");
    }

    @Callable
    public static int getAddressCount(){
        return addressList.size();
    }

    @Callable
    public static void getAddressList(){
        if(addressList.isEmpty()){
            Blockchain.println("Address list is empty!");
        }
        else {
            Blockchain.println("List of addresses - ");
            for(int i = 0; i < addressList.size(); i++){
                Blockchain.println(addressList.get(i).toString());
            }
        }
    }

    @Callable
    public static void removeAddress(){
        Blockchain.require(!addressList.isEmpty());
        Address caller = Blockchain.getCaller();
        Blockchain.require(addressPresent(caller));
        addressList.remove(caller);
        Blockchain.println("Address: " + caller.toString() + " removed from the list!");
        Blockchain.println("Address count: " + getAddressCount());
    }
}

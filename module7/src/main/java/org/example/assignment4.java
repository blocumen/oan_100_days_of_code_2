package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionList;

public class assignment4 {
//    Create a contract which has two methods to add new public addresses to the
//    list, check if the address exists and remove from the list. Also, it gives the
//    total count of addresses in the list

    private static AionList<String> myAionList = new AionList<>();
    private static AionList<Address> addAionList = new AionList<>();

    @Callable
    public static void addStr(String str1){
        myAionList.add(str1);
    }

    @Callable
    public static void addAddress(Address add){
        addAionList.add(add);
    }

    @Callable
    public static boolean findAddress(Address add){
        return addAionList.contains(add);
    }

    @Callable
    public static void removeAdd(Address add){
        Blockchain.require(findAddress(add));
        addAionList.remove(add);
    }

    @Callable
    public static int CountAdd(){
        return addAionList.size();
    }

    @Callable
    public static void removeStr(String str2){
        myAionList.remove(str2);
    }

    @Callable
    public static void clearAll(){
        myAionList.clear();
    }

    @Callable
    public static boolean findStr(String fStr){
        return myAionList.contains(fStr);
    }


}

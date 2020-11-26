package org.example;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionBuffer;

public class BufferExample
{
    private static byte[] buyerInfo;

    @Callable
    public static void addBuyerInfo(Address ownerAddress, String carMake, String carModel, int price){
        // Allocate a new AionBuffer
        buyerInfo = AionBuffer.allocate(Address.LENGTH + Integer.BYTES + carMake.length() + Integer.BYTES + carModel.length() + Integer.BYTES)
                .putAddress(ownerAddress)
                .putInt(carMake.length())
                .put(carMake.getBytes())
                .putInt(carModel.length())
                .put(carModel.getBytes())
                .putInt(price)
                .getArray();
    }

    @Callable
    public static String getBuyerInfo(){
        // Wrap an existing byte array into a buffer
        AionBuffer buyerInfoBuffer = AionBuffer.wrap(buyerInfo);
        Address address = buyerInfoBuffer.getAddress();

        int carMakeLength = buyerInfoBuffer.getInt();
        byte[] carMakeArray = new byte[carMakeLength];
        buyerInfoBuffer.get(carMakeArray);
        String carMake = new String(carMakeArray);

        int carModelLength = buyerInfoBuffer.getInt();
        byte[] carModelArray = new byte[carModelLength];
        buyerInfoBuffer.get(carModelArray);
        String carModel = new String(carModelArray);

        int price = buyerInfoBuffer.getInt();
        return "Buyer address: " + address + "\nCar Make: " + carMake + "\nCar Model: " + carModel + "\nPrice: " + price;
    }
}

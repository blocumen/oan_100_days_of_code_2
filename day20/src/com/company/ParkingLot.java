package com.company;

import java.util.HashMap;

public class ParkingLot {
    public int parkingCapacity;
    HashMap<String,Vehicle> occupied = new HashMap<>(parkingCapacity);

    public ParkingLot(int size){
        this.parkingCapacity=size;
    }

    public boolean park(Vehicle auto){
        if(occupied.size()<parkingCapacity){
            occupied.put(auto.registrationNumber,auto);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean unPark(Vehicle auto){
        if(occupied.containsKey(auto.registrationNumber)){
            occupied.remove(auto.registrationNumber);
            return true;
        }
        else{
            return false;
        }
    }

    public void parkedVehicle(){
        System.out.println(occupied.keySet());
    }

    public int spaceLeft(){
        return parkingCapacity-occupied.size();
    }

}

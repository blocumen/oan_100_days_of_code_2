package com.company;
import java.util.HashMap;
import java.util.Set;


public class Parking {

    int space;
    HashMap<String,Vehicle> occupied = new HashMap<>(space);

    public Parking(int space){
        this.space = space;
    }

    public boolean park(Vehicle any){
        if(occupied.size()<space){
            occupied.put(any.getRegistrationNumber(), any);
            System.out.println("Parked " + any.getRegistrationNumber());
            return true;
        }else{
            System.out.println("No space available to park");
            return false;
        }
    }

    public boolean unpark(String regNum){
        if(occupied.containsKey(regNum)){
            occupied.remove(regNum);
            System.out.println("Vehicle removed from parking.");
            return true;
        }else{
            System.out.println("Vehicle with registration number not parked in the parking lot.");
            return false;
        }
    }
    public void listOfParkedVehicles(){
        System.out.println(occupied.keySet());
    }

    public int spaceLeft(){
        return space-occupied.size();
    }
}

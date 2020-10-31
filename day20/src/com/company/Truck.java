package com.company;

public class Truck extends Vehicle{

    public int cargoVolume;
    Truck(String registrationNumber,String brand,int cargoVolume){
        super("T"+registrationNumber,brand);
        this.cargoVolume=cargoVolume;
    }

    public static void main(String[] args){
        Truck prima= new Truck("T960","Tata",5000);
    }
}

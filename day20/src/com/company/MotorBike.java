package com.company;

public class MotorBike extends Vehicle {

    public int engineSize;
    MotorBike(String registraionNumber,int engineSize,String brand){
        super("B"+registraionNumber,brand);
        this.engineSize=engineSize;
    }

    public static void main(String[] args){
        MotorBike daytona = new MotorBike("B3060",675,"Triumph");
    }
}

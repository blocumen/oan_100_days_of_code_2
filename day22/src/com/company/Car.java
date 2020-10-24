package com.company;

public class Car extends Vehicle{
    private int numDoors;
    private String color;

    public Car(int numDoors, String color, String regNum, String brand){
        super('C'+ regNum, brand);
        this.numDoors   =  numDoors ;
        this.color      =   color   ;
    }
    public Car(){
        super();
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }
    public int getNumDoors(){
        return numDoors;
    }
    public void setNumDoors(int numDoors){
        this.numDoors= numDoors;
    }

}

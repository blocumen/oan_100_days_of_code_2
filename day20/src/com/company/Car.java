package com.company;

public class Car extends Vehicle{

    private int noDoors;
    private String color;
    public Car(String registrationNumber,int noDoors,String color,String brand){
        super("C"+registrationNumber,brand);
        this.noDoors=noDoors;
        this.color=color;
    }
    public static void main(String[] args){
        Car amg=new Car("C63",2,"black","Merecedes");
    }



}

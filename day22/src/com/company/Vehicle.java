package com.company;

public class Vehicle {
    private String regNum;
    private String brand;
    public Vehicle(String regNum, String brand){
        this.regNum = regNum;
        this.brand = brand;
    }
    public Vehicle(){
        super();
    }
    public String getRegNum(){

        return regNum;
    }
    public String getBrand(){
        return brand;
    }
}

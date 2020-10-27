package com.company;

public class Motorbike extends Vehicle {
    private int engineSize;


    public Motorbike(int engineSize,String regNum, String brand){
        super('B'+ regNum, brand);
        this.engineSize   =  engineSize ;

    }

    public int getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(int engineSize){
        this.engineSize = engineSize;
    }

    public static void main(String[] args) {
        Motorbike Duke = new Motorbike(250, "666", "KTM");
        System.out.println(Duke.getBrand());
    }

}

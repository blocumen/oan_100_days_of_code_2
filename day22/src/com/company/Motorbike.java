package com.company;

public class Motorbike extends Vehicle {
    private int engineSize;


    public Motorbike(int engineSize,String regNum, String brand){
        super('B'+ regNum, brand);
        this.engineSize   =  engineSize ;

    }
    public Motorbike(){
        super();
    }

    public int getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(int engineSize){
        this.engineSize = engineSize;
    }


}

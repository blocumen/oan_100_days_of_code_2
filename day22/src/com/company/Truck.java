package com.company;

public class Truck extends Vehicle{
    private int volume;


    public Truck(int volume, String regNum, String brand){
        super('T'+ regNum, brand);
        this.volume   =  volume ;
    };
    public Truck(){
        super();
    }

    public int getVolume(){
        return volume;
    };

    public void setVolume(int volume){
        this.volume= volume;
    };


}

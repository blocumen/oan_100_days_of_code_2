package com.company;

public class Truck extends Vehicle {
    private int volume;
    public Truck(int volume, String registrationNumber, String brand) {
        super("T" + registrationNumber, brand);
        this.volume = volume;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public static void main(String[] args) {
        Truck Eicher = new Truck(35, "77", "Ashok Leyland");
        System.out.println(Eicher.getVolume());

    }

}

package com.company;

public class Car extends Vehicle {
    private int numOfDoors;
    private String color;

    public Car(String color, int numOfDoors, String registrationNumber, String brand) {
        super("C" + registrationNumber, brand);
        this.numOfDoors = numOfDoors;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
    Vehicle i8 = new Car("White", 2, "73", "BMW");
    System.out.print(i8.getBrand());
    }
}
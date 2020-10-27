package com.company;



public class Vehicle {
    protected String registrationNumber;
    protected String brand;
    public Vehicle(String registrationNumber, String brand) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;

    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String getBrand() {
        return brand;
    }
    public static void main(String[] args) {
	// write your code here
    }
}

package com.company;


public class Main {
    public static void main(String[] args) {
        ParkingLot floor1 = new ParkingLot(100);

        Car car1 = new Car(4, "green", "619", "Toyota");

        floor1.park(car1);

        Motorbike bike1 = new Motorbike(5,"519","Suzuki");
        Motorbike bike2 = new Motorbike(4,"518","Suzuki");

        floor1.park(bike1);
        floor1.park(bike2);

        Truck truck1 = new Truck(5,"419","Mahindra");

        floor1.park(truck1);

        System.out.println("Space left in the parking lot :" + floor1.spaceLeft());

        floor1.listOfParkedVehicles();

        floor1.unpark(bike2.getRegNum());

        floor1.listOfParkedVehicles();
    }
}

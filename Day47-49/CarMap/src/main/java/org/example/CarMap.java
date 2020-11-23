/*
    Module 7 - Day 48
    AionMap Example
 */
package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionMap;

import java.util.Set;

public class CarMap {
    String make;
    String model;
    String colour;
    private static final AionMap<Integer, CarMap> cars = new AionMap<>();

    // method to add a new car to the AionMap
    @Callable
    public static boolean addCar(String make, String model, String colour) {
        CarMap newCar = new CarMap();
        newCar.make = make;
        newCar.model = model;
        newCar.colour = colour;

        cars.put(cars.size(), newCar);
        return true;
    }

    private static CarMap getCar(int key) {
        return cars.get(key);
    }

    @Callable
    public static String displayCar(int key) {
        CarMap currentCar = getCar(key);
        return "\nID: " + key + " | Make: " + currentCar.make + " | Model: " + currentCar.model + " | Color: " + currentCar.colour + "\n";
    }

    public static AionMap getMap() {
        return cars;
    }

    @Callable
    public static String getCars() {
        Set<Integer> carIds = cars.keySet();
        String returnString = "\n";

        // Loop through each car based on their ID.
        for (int id : carIds) {
            String make = cars.get(id).make;
            String model = cars.get(id).model;
            String color = cars.get(id).colour;

            // Add the car details to a String.
            returnString = returnString + "ID: " + id + " | Make: " + make + " | Model: " + model + " | Color: " + color + "\n";
        }
        return returnString;
    }
}

package ParkingManagement;

public class Car extends Vehicle{
    private int numOfDoors;
    private String colour;

    public Car(String brand, String regNo, int numOfDoors, String colour) {
        super(brand, regNo);
        this.numOfDoors = numOfDoors;
        this.colour = colour;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }
}

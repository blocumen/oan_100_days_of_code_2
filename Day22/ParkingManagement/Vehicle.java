package ParkingManagement;

public class Vehicle {
    private String regNo;
    private String brand;

    public Vehicle(String brand, String regNo) {
        this.brand= brand;
        this.regNo = regNo;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegNo() {
        return regNo;
    }
}

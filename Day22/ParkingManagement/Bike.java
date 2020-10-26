package ParkingManagement;

public class Bike extends Vehicle{
    private int engineSize;

    public Bike(String brand, String regNo, int engineSize) {
        super(brand, regNo);
        this.engineSize = engineSize;
    }

    public int getEngineSize() {
        return engineSize;
    }
}

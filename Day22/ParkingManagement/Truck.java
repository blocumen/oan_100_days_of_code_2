package ParkingManagement;

public class Truck extends Vehicle{
    private int volume;

    public Truck(String brand, String reg_no, int volume) {
        super(brand, reg_no);
        this.volume = volume;
    }

    public int get_volume() {
        return volume;
    }
}

package Day22.ParkingManagement;

public class Truck extends Vehicle {
	private double cargoVolume;

	public Truck(double cargoVolume, String brandName, String regNum) {
		super(brandName, 'T' + regNum);
		this.cargoVolume = cargoVolume;
	}

	public Truck() {
		super();
	}

	public double getCargoVolume() {
		return cargoVolume;
	}

	public void setCargoVolume(double cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

}

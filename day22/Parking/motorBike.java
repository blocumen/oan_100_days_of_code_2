package Parking;

public class motorBike extends vehicle {
	int engineSize;

	public motorBike(String brand, String regNo, int engineSize) {
		super(brand, regNo);
		this.engineSize = engineSize;
	}

	int getEngineSize() {
		return engineSize;
	}
}

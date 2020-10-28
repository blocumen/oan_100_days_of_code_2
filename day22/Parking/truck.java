package Parking;

public class truck extends vehicle {
	int cargoVolume;

	public truck(String brand, String regNo, int cargoVolume) {
		super(brand, regNo);
		this.cargoVolume = cargoVolume;
	}

	int getCargoVolume() {
		return cargoVolume;
	}
}

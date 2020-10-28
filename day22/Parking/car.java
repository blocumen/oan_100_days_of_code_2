package Parking;

public class car extends vehicle {
	int noDoors;
	String color;

	public car(String brand, String regNo, int noDoors, String colors) {
		super(brand, regNo);
		this.noDoors = noDoors;
		this.color = colors;
	}

	String getColor() {
		return color;
	}

	int getNoDoors() {
		return noDoors;
	}
}

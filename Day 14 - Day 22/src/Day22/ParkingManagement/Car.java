package Day22.ParkingManagement;

public class Car extends Vehicle {
	private int numDoors;
	private String color;

	public Car(int numDoors, String color, String brandName, String regNum) {
		super(brandName, 'C' + regNum);
		this.numDoors = numDoors;
		this.color = color;
	}
	
	public Car()
	{
		super();
	}
	
	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

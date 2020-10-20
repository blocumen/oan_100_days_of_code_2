package CustomVehicle;

/**
 * @author HGunjalli
 *
 */
public class Vehicle {
	private int numOfWheels;
	private int milage;
	private int horsePower;

	public Vehicle(int numOfWheels, int milage, int horsePower) {
		super();
		this.numOfWheels = numOfWheels;
		this.milage = milage;
		this.horsePower = horsePower;
	}

	public Vehicle() {
		super();
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

}

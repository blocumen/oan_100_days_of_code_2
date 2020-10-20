package Day22.ParkingManagement;

/**
 * @author HGunjalli
 *
 */
public class Motorbike extends Vehicle {
	private double engineSize;

	public Motorbike(double engineSize, String brandName, String regNum) {
		super(brandName, 'B' + regNum);
		this.engineSize = engineSize;
	}

	public Motorbike() {
		super();
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

}

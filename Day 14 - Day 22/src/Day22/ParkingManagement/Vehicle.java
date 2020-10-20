package Day22.ParkingManagement;

/**
 * @author HGunjalli
 *
 */
public class Vehicle {
	private String brandName;
	private String regNum;

	public Vehicle(String brandName, String regNum) {
		super();
		this.brandName = brandName;
		this.regNum = regNum;
	}

	public Vehicle() {
		super();
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getRegNum() {
		return regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

}

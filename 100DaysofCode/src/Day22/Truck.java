package Day22;

public class Truck extends Vehicle {
	public String cargoVolume;

	public Truck(String brand, String Registration,String cargoVolume) {
		super(brand, Registration);
		this.cargoVolume=cargoVolume;
		
	}

}

package Day22;

public class ParkingLot extends Vehicle{
	public int totalSpace;
	public int n;
	Object[] vehicle;
	public ParkingLot(String brand, String Registration,int totalSpace) {
		super(brand, Registration);
		this.totalSpace= totalSpace;
		
	}
	
	
	public void park() {
		if(Vehicle.size()<totalSpace) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

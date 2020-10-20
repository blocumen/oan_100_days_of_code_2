package Day22.ParkingManagement;

/**
 * @author HGunjalli
 *
 */
import java.util.HashMap;
import java.util.Set;

public class ParkingLot {
	private int totalCapacity;
	// private HashSet<Vehicle> vehicles;
	private HashMap<String, Vehicle> vehicles;

	public ParkingLot(int totalCapacity) {
		this.totalCapacity = totalCapacity;
		vehicles = new HashMap<String, Vehicle>(totalCapacity);
		// vehicles = new HashSet<Vehicle>(totalCapacity);
	}

	public ParkingLot() {
		this.totalCapacity = 1000;
		vehicles = new HashMap<String, Vehicle>(totalCapacity);
	}

	public boolean park(Vehicle veh) {
		if (vehicles.size() < totalCapacity) {
			vehicles.put(veh.getRegNum(), veh);
			System.out
					.println("Vehicle with Registration Number " + veh.getRegNum() + " has been parked successfully.");
			return true;
		} else {
			System.out.println("Parking Full!");
			return false;
		}
	}

	public boolean unpark(String regNum) {
		if (vehicles.containsKey(regNum)) {
			vehicles.remove(regNum);
			System.out.println("Unparked the the vehicle with Registration Number: " + regNum);
			return true;
		} else {
			System.out.println("Vehicle with Registration Number " + regNum
					+ " not found. Please enter valid registration number");
			return false;
		}
	}

	public void listOfParkedVehicles() {
		System.out.println("Printing list of parked vehicles");

		Set<String> keySet = vehicles.keySet();

		for (String key : keySet) {
			Vehicle v = vehicles.get(key);
			System.out.println(v.getRegNum() + " " + v.getBrandName());
		}
	}

	public int spaceLeft() {
		return totalCapacity - vehicles.size();
	}
}

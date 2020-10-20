package Day22.ParkingManagement;

/**
 * @author HGunjalli
 *
 */
public class DriverClass {
	public static void main(String[] args) {
		// Create a parking lot.
		ParkingLot parkingLot = new ParkingLot(10);
		// Add cars to the Parking lot.
		Car c1 = new Car(2, "blue", "TATA", "121");
		Car c2 = new Car(2, "blue", "TATA", "122");
		Car c3 = new Car(2, "blue", "TATA", "123");
		Car c4 = new Car(2, "blue", "TATA", "124");

		parkingLot.park(c1);
		parkingLot.park(c2);
		parkingLot.park(c3);
		parkingLot.park(c4);

		System.out.println("Space left after parking Cars: " + parkingLot.spaceLeft());

		// Add bikes to the Parking lot.
		Motorbike b1 = new Motorbike(125, "Bajaj", "131");
		Motorbike b2 = new Motorbike(125, "Bajaj", "132");
		Motorbike b3 = new Motorbike(125, "Bajaj", "133");

		parkingLot.park(b1);
		parkingLot.park(b2);
		parkingLot.park(b3);

		System.out.println("Space left after parking Motorbikes: " + parkingLot.spaceLeft());

		// Add trucks to the Parking lot.
		Truck t1 = new Truck(112233, "Ashok Leyland", "141");
		Truck t2 = new Truck(112233, "Ashok Leyland", "142");
		Truck t3 = new Truck(112233, "Ashok Leyland", "143");

		parkingLot.park(t1);
		parkingLot.park(t2);
		parkingLot.park(t3);

		System.out.println("Space left after parking Trucks: " + parkingLot.spaceLeft());

		// Add one more vehicle to the parking lot and see if it throws any error.
		Motorbike b4 = new Motorbike(200, "Yamaha", "134");

		parkingLot.park(b4);

		// Unpark the vehicles and see if we are able to unpark and check the capacity
		// right after unparking.
		parkingLot.unpark(c4.getRegNum());
		System.out.println("Space left after unparking 1 car: " + parkingLot.spaceLeft());

		// Try to unpark a vehicle which is not present.
		parkingLot.unpark("T1234");

	}
}

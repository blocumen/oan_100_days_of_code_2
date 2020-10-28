import Parking.*;

import java.util.*;
class parkinglot {
	static final int MAXSLOT = 25;
	int freeSlots = MAXSLOT;

	vehicle[] parked = new vehicle[MAXSLOT];

        public static void main(String[] args)
        {
		parkinglot lot = new parkinglot();
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
		System.out.println("Welcome to parkinglot management system");
		boolean quit = false;
		vehicle cars;

		do {
			System.out.println("Enter the action to be performed");
			System.out.println("1. Park a vehicle");
			System.out.println("2. Unpark a vehicle");
			System.out.println("3. Parking Space Left");
			System.out.println("4. List of cars parked");
			System.out.println("5. Quit Parking application");
			int a= sc.nextInt();

			switch (a) {
				case 1:
					cars = lot.getVehicle();
					lot.park(cars);
					break;
				case 2:
					cars = lot.getVehicle();
					lot.unpark(cars);
					break;
				case 3:
					System.out.println("Parking space left is" + lot.spaceLeft());
					break;
				case 4:
					lot.parkedVehicle();
					break;
				case 5:
					quit = true;
					break;
				default: System.out.println("Wrong input, please try again");
					 break;
			}

		}
		while(quit == false);
	}
	public void park(vehicle cars) {
		if (freeSlots > 0) {
			parked[MAXSLOT - freeSlots] = cars;
			freeSlots = freeSlots - 1;
		}
		else {
			System.out.println("No free slot to park");
		}
	}

	public void unpark(vehicle cars) {
		int i = 0;
		boolean found = false;

		for(; i < (MAXSLOT - freeSlots); i++) {
			if(vehicleEquals(parked[i] ,cars))
			{
				found = true;
				break;
			}
		}


		if (found) {
			for(int j = i; j < (MAXSLOT - freeSlots -1); j++) {
				parked[j] = parked[j+1];
			}

			freeSlots = freeSlots + 1;

			parked[MAXSLOT - freeSlots] = null;

		}
		else {
			System.out.println("Car not found" + cars.getBrand() + cars.getRegNo());
		}
	}

	public int spaceLeft() {
		return freeSlots;
	}

	public void parkedVehicle() {
		for(int i = 0; i < (MAXSLOT - freeSlots) ; i++) {
			System.out.println(parked[i].getBrand() + parked[i].getRegNo());
		}
	}

	boolean vehicleEquals(vehicle car1, vehicle car2) {
		return (car1.getBrand().equals(car2.getBrand()) && car1.getRegNo().equals(car2.getRegNo()));
	}

	protected vehicle getVehicle() {
		String brand;
		String regNo;
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
		boolean quit = false;

		System.out.println("Enter the Vehicle brand");
		brand = sc.nextLine();

		System.out.println("Enter the Vehicle regNo");
		regNo = sc.nextLine();

		do {
			System.out.println("Enter the Type of Vehicle");
			System.out.println("1. Car");
			System.out.println("2. Truck");
			System.out.println("3. motorBike");
			int a= sc.nextInt();
			switch(a) {
				case 1:
					int noDoors;
					String color;

					System.out.println("Enter the number of car doors");
					noDoors= sc.nextInt();

					System.out.println("Enter the car color");
					color = sc.nextLine();

					return (vehicle) (new car(brand, regNo, noDoors, color));
				case 2:
					int cargoVehicle;

					System.out.println("Enter the cargo volume of the truck");
					cargoVehicle = sc.nextInt();

					return (vehicle) new truck(brand, regNo, cargoVehicle);
				case 3:
					int engineSize;

					System.out.println("Enter the engine size of motorBike");
					engineSize = sc.nextInt();

					return (vehicle) new motorBike(brand, regNo, engineSize);
				default:
					System.out.println("Wrong vehicle type");
					break;
			}

		}
		while(quit == false);

		return null;
	}

}

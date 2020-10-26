/*
    Module 3 - Day 22
    Final Assignment

    The program should allow to add Vehicle to the parking lot, delete the vehicle and print the list of currently
    parked vehicles and give information if parked vehicles are cars bikes or truck.

    Create a class parkingLot with methods like park(), unpark(), list of current parkedvehicle() and also how much
    spaceleft() in parking lot parking lot could have n number of space.
 */
package ParkingManagement;
import java.util.HashMap;
import java.util.Scanner;

public class ParkingLot {
    private int space;
    private HashMap<String, Vehicle> parking;

    public ParkingLot(int space) {
        this.space = space;
        parking = new HashMap<String, Vehicle>(space);
        System.out.println("Parking lot created with " + space + " spaces");
    }

    public void park(Vehicle vehicle) {
        if(parking.size() < space) {
            parking.put(vehicle.getRegNo(), vehicle);
        } else {
            System.out.println("Parking full!");
        }
    }

    public void unpark(String regNo) {
        if(parking.containsKey(regNo)) {
            parking.remove(regNo);
        } else {
            System.out.println("No vehicle found with registration no: " + regNo);
        }
    }

    public void parkedVehicle() {
        for(String key: parking.keySet()) {
            Vehicle vehicle = parking.get(key);
            System.out.println(vehicle.getRegNo() + " " + vehicle.getBrand());
        }
    }

    public int spaceLeft() {
        return space - parking.size();
    }

    public void displaymenu() {
        System.out.println("------------------ MENU -----------------");
        System.out.println("1. Park a vehicle");
        System.out.println("2. Unpark a vehicle");
        System.out.println("3. List of parked vehicles");
        System.out.println("4. Exit");
        System.out.println("-----------------------------------------");
    }

    public Vehicle createVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type of vehicle(Car, Bike, Truck): ");
        String type = scanner.nextLine();
        System.out.print("Enter the brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter registration no: ");
        String reg_no = scanner.nextLine();

        if(type.equals("Car")) {
            System.out.print("Enter number of doors in the car: ");
            int num_doors = scanner.nextInt();
            System.out.print("Enter the colour: ");
            String colour = scanner.next();
            Car car = new Car(brand, reg_no, num_doors, colour);
            return car;
        } else if(type.equals("Bike")) {
            System.out.print("Enter engine size: ");
            int engine = scanner.nextInt();
            Bike bike = new Bike(brand, reg_no, engine);
            return bike;
        } else {
            System.out.print("Enter load volume: ");
            int volume = scanner.nextInt();
            Truck truck = new Truck(brand, reg_no, volume);
            return truck;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size for parking lot: ");
        int parkingSize = scanner.nextInt();
        ParkingLot parkingLot = new ParkingLot(parkingSize);

        int input;
        do {
            parkingLot.displaymenu();
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    Vehicle vehicle = parkingLot.createVehicle();
                    parkingLot.park(vehicle);
                    System.out.println("Vehicle parked.");
                    System.out.println("Remaining spaces: " + parkingLot.spaceLeft());
                    break;
                case 2:
                    System.out.print("Enter the registration no: ");
                    String regNo = scanner.next();
                    parkingLot.unpark(regNo);
                    System.out.println("Vehicle unparked.");
                    System.out.println("Remaining spaces: " + parkingLot.spaceLeft());
                    break;
                case 3:
                    System.out.println("Parked vehicles -");
                    parkingLot.parkedVehicle();
                    break;
                default:
                    System.out.println("Thank you for using the parking system!");
                    System.exit(0);
            }
        } while(true);
    }
}

/**
 * 
 */
package CustomVehicle;

/**
 * @author HGunjalli
 *
 */
public class MakeCustomVehicle {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car c1 = new Car(4, 15, 2345);
		
		c1.increaseMilage(4);
		c1.addWheels(1);
		c1.increaseHorsePower(4);
		
		Bike b1 = new Bike(2, 45, 220);
		
		b1.increaseMilage(2);
		b1.addWheels(1);
		b1.increaseHorsePower(2);
		
		System.out.println("===================================================");
		System.out.println("Properties of Car Object");
		System.out.println("Num of Wheels: " + c1.getNumOfWheels());
		System.out.println("Milage: " + c1.getMilage());
		System.out.println("Horsepower: " + c1.getHorsePower());
		
		System.out.println("===================================================");
		System.out.println("Properties of Bike Object");
		System.out.println("Num of Wheels: " + b1.getNumOfWheels());
		System.out.println("Milage: " + b1.getMilage());
		System.out.println("Horsepower: " + b1.getHorsePower());

	}

}

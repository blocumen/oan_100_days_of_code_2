/**
 * 
 */
package CustomVehicle;

import Calculator.Operations;

/**
 * @author HGunjalli
 *
 */
public class Car extends Vehicle {

	private Vehicle veh;
	private Operations op = new Operations();

	public Car() {
		veh = new Vehicle();
	}

	public Car(int numOfWheels, int milage, int horsePower) {
		veh = new Vehicle(numOfWheels, milage, horsePower);
	}

	public float increaseMilage(int multiple) {
		veh.setMilage((int)op.product(veh.getMilage(), multiple));
		return veh.getMilage();
	}

	public int decreaseMilage(int multiple) {
		veh.setMilage((int)op.division(veh.getMilage(), multiple));
		return veh.getMilage();
	}

	public int addWheels(float extraWheels) {
		if(getNumOfWheels() >= 4)
		{
			System.out.println("Cannot add more than 4 wheels to the car.");
			veh.setNumOfWheels(4);
			return getNumOfWheels();
		}
		veh.setNumOfWheels((int)op.sum(veh.getNumOfWheels(), extraWheels));
		return veh.getNumOfWheels();
	}

	public int increaseCost(float multiple) {
		veh.setMilage((int)op.product(veh.getMilage(), multiple));
		return veh.getMilage();
	}
	
	public int getMilage()
	{
		return veh.getMilage();
	}
	
	public int getNumOfWheels()
	{
		return veh.getNumOfWheels();
	}
	
	public int getHorsePower()
	{
		return veh.getHorsePower();
	}

}

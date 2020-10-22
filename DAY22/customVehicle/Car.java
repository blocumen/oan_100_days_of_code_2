package customVehicle;
import 	calculator.*;


public class Car extends Vehicle  {
	
	public Car(int wheels, float milage, float hp) {
		super(wheels, milage, hp);
		// TODO Auto-generated constructor stub
	}

	public double increaseMileage(float increaseMileage)
	{
		double output = 0;
		Operations oper = new Operations();
		output = oper.multiply(this.mileage,increaseMileage);
		return output;	
	}
	
	public double decreaseMileage(float decreaseMileage)
	{
		double output = 0;
		Operations oper = new Operations();
		output = oper.division(this.mileage,decreaseMileage);
		return output;	
	}
	
	public double increaseHorsePower(float increaseHP)
	{
		double output = 0;
		Operations oper = new Operations();
		output = oper.multiply(this.mileage,increaseHP);
		return output;	
	}
	
	public double decreaseHorsePower(float decreaseHP)
	{
		double output = 0;
		Operations oper = new Operations();
		output = oper.division(this.mileage,decreaseHP);
		return output;	
	}
	
	public int addWheels(int noOfWheels)
	{
		int output = 0;
		Operations oper = new Operations();
		output = oper.sum(this.numOfWheels,noOfWheels);
		return output; 
	}
}

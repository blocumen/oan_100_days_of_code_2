package customVehicle;
import java.util.*;


public class MakeCustomVehicle
{
	public static void main(String[] args)
	{
		String 	typeOfVehicle;
		String 	typeOfVehicleDesc = "";
		float  	changeMileage;
		float  	changeHP;
		int  	addWheelsInput;
		
		double	increasedMileage;
		double	increasedHP;
		int		addedWheels;
		
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);
		
		
		do 
		{
			System.out.println("Enter which Vehicle you need to Customize");
			System.out.println("C-CAR");
			System.out.println("B-BIKE");
			typeOfVehicle = myObj.nextLine();
			
			if(typeOfVehicle.equals("C"))
			{	
				typeOfVehicleDesc = "CAR";
			}
		
			
			if(typeOfVehicle.equals("B"))
			{
				typeOfVehicleDesc = "BIKE";
			}
		}
		while(typeOfVehicle.isBlank());
		
		
		System.out.println("THE SELECTED VEHICLE : "+typeOfVehicleDesc);
		
		if(typeOfVehicle.equals("C"))
		{
			Car car = new Car(4,20,120);
			System.out.println("ENTER THE AMOUNT BY WHICH MILEAGE NEEDS TO INCREASE.");
			changeMileage = myObj.nextFloat();
			increasedMileage = car.increaseMileage(changeMileage);
			
			System.out.println("ENTER THE AMOUNT BY WHICH HORSEPOWER NEEDS TO INCREASE.");
			changeHP = myObj.nextFloat();
			increasedHP = car.increaseHorsePower(changeHP);
			
			
			System.out.println("ENTER THE NO. OF WHEELS NEEDS TO BE ADDED 0-10.");
			addWheelsInput = myObj.nextInt();
			addedWheels = car.addWheels(addWheelsInput);
			System.out.println("THE INCREASED MILEAGE IS 	:"+increasedMileage);
			System.out.println("THE INCREASED HORSEPOWER IS 	:"+increasedHP);
			System.out.println("THE TOTAL WHEELS IS 		:"+addedWheels);
			
		}
		
		if(typeOfVehicle.equals("B"))
		{
			Bike car = new Bike(2,60,100);
			System.out.println("ENTER THE AMOUNT BY WHICH MILEAGE NEEDS TO INCREASE.");
			changeMileage = myObj.nextFloat();
			increasedMileage = car.increaseMileage(changeMileage);
			
			System.out.println("ENTER THE AMOUNT BY WHICH HORSEPOWER NEEDS TO INCREASE.");
			changeHP = myObj.nextFloat();
			increasedHP = car.increaseHorsePower(changeHP);
			
			System.out.println("ENTER THE NO. OF WHEELS NEEDS TO BE ADDED 0-2");
			addWheelsInput = myObj.nextInt();
			addedWheels = car.addWheels(addWheelsInput);
			System.out.println("THE INCREASED MILEAGE IS 	:"+increasedMileage);
			System.out.println("THE INCREASED HORSEPOWER IS 	:"+increasedHP);
			System.out.println("THE TOTAL WHEELS IS 		:"+addedWheels);
		}
		
	}

}
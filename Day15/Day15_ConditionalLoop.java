package AssignmentPackage;

import java.util.Scanner;

public class Day15_ConditionalLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using Scanner for Getting Input from User 
		Scanner inObj=new Scanner(System.in);
				
		System.out.println("Enter the 1st number:");
		float num1=inObj.nextFloat();
		System.out.println("Enter the 2nd number:");
		float num2=inObj.nextFloat();
		
		System.out.println("Addition of 2 numbers is:"+(num1+num2));
		
		Day15_ConditionalLoop obj1= new Day15_ConditionalLoop();
		float ResultSum=obj1.AdditionFunction(num1, num2);
		System.out.println("The value of the AdditionFunction is:"+ ResultSum);
		
	}
	
	public float AdditionFunction(float Number1,float Number2)
	{
		float AdditionSum=Number1 + Number2;
		return AdditionSum;	
		
	}
	
}

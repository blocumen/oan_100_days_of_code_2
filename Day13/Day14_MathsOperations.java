// Write a program that asks the user for two numbers and prints their sum, difference, product and quotient. 

import java.util.*;


public class Day14_MathsOperations {
	
	public static void main(String args[])
	{
		// Using Scanner for Getting Input from User 
		Scanner inObj=new Scanner(System.in);
		
		System.out.println("Enter the 1st number:");
		float num1=inObj.nextFloat();
		System.out.println("Enter the 2nd number:");
		float num2=inObj.nextFloat();
		
		System.out.println("Addition of 2 numbers is:"+(num1+num2));
		System.out.println("Substraction of 2 numbers is:"+(num1-num2));
		System.out.println("Multiplication of 2 numbers is:"+(num1*num2));
		System.out.println("Division of Number 1 by Number 2 is:"+(num1/num2));
				
	}

}

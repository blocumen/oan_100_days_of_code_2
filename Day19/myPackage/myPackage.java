package myPackage;

import java.util.*;

public class MyClass {

	@SuppressWarnings("resource")
	public void getNames() 
	{
		String names="";
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter a Name:");
		names = obj.nextLine();
		System.out.println("The Entered Name is "+names);
	}
}

package myPackage;

import java.util.*;

public class MyClass {

	@SuppressWarnings("resource")
	public void getNames() 
	{
		String names="";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Name:");
		names = obj.nextLine();
		System.out.println("Entered Name is "+names);
	}
}

package myPackage;

import java.util.Scanner;

public class MyClass {
    public void getName() {
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name");
        String yourName = name.nextLine();
        System.out.println("Your name is " + yourName);


    }

    public static void main(String[] args) {
	// write your code here
        MyClass abc = new MyClass();
        abc.getName();
    }
}

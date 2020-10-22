package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number for widening :");
        byte num1 = read.nextByte();
        System.out.println("Enter a number for narrowing :");
        double num2= read.nextDouble();

        //Widening

        System.out.println("...Widening...");
        System.out.println("to short " +(short)num1);
        System.out.println("to int " +(int)num1);
        System.out.println("to float " +(float)num1);
        System.out.println("to double " +(double)num1);

        //Narrowing

        System.out.println("...Narrowing...");
        System.out.println("to float " +(float)num2);
        System.out.println("to int " +(int)num2);
        System.out.println("to short " +(short)num2);
        System.out.println("to byte " +(byte)num1);
    }
}

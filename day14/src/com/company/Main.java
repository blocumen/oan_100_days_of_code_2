package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        double a = sc.nextDouble();
        System.out.println("Enter another number :");
        double b = sc.nextDouble();

        double sum = a + b;
        double sub = a - b;
        double div = a / b;
        double mul = a * b;

        System.out.println("The addition of the two entered numbers is :" + sum);
        System.out.println("The subtraction of the two entered numbers is :" + sub);
        System.out.println("The division of the two entered numbers is :" + div);
        System.out.println("The multiplication of the two entered numbers is :" + mul);


    }
}

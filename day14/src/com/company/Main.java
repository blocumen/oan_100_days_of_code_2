package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        float a = sc.nextFloat();
        System.out.println("Enter another number :");
        float b = sc.nextFloat();

        float sum = a + b;
        float sub = a - b;
        float mul = a * b;
        float div = a / b;

        System.out.println("The addition of the numbers entered is :" + sum);
        System.out.println("The subtraction of the numbers entered is :" + sub);
        System.out.println("The multiplication of the numbers entered is :" + mul);
        System.out.println("The division of the numbers entered is :" + div);
    }
}

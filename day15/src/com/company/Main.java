package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double a = sc.nextDouble();
        System.out.println("Enter another number :");
        double b = sc.nextDouble();

        double sum = a + b;

        if(sum > 50){
            System.out.println("Number is greater than 50");
        }else
        {
            System.out.println("Number is less than 50");
        }

    }
}

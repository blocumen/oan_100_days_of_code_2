package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first Number:");
        float a=sc.nextFloat();
        System.out.println("Enter second Number:");
        float b= sc.nextFloat();

        float sum= a+b;
        float diff= a-b;
        float prod= a*b;
        float div= a/b;

        System.out.println("The addition of the numbers entered is :" + sum);
        System.out.println("The subtraction of the numbers entered is :" + diff);
        System.out.println("The multiplication of the numbers entered is :" + prod);
        System.out.println("The division of the numbers entered is :" + div);
    }
}

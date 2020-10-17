
/*
Day 14 - Write a program that asks the user for two numbers and prints their sum, difference, product and quotient.
Date: 16/10/2020
 */

import java.util.*;


public class AirthmeticOperations
{

    public AirthmeticOperations()
    {

    }
    public int add (int a, int b)
    {
        return a+b;
    }
    public int sub (int a, int b)
    {
        return a-b;
    }
    public int mul (int a, int b)
    {
        return a*b;
    }
    public int div (int a, int b)
    {
        return a/b;
    }


    public float fadd (float a, float b)
    {
        return a+b;
    }
    public float fsub (float a, float b)
    {
        return a-b;
    }
    public float fmul (float a, float b)
    {
        return a*b;
    }
    public float fdiv (float a, float b)
    {
        return a/b;
    }


    public double dadd (double a, double b)
    {
        return a+b;
    }
    public double dsub (double a, double b)
    {
        return a-b;
    }
    public double dmul (double a, double b)
    {
        return a*b;
    }
    public double ddiv (double a, double b)
    {
        return a/b;
    }

   public static void main(String[] args)
   {

       int x, y;
       float x1= 100.50f, y1= 50.25f;
       double x2 =100.50d,y2 =50.25d;
       x = 50;
       y = 20;

        AirthmeticOperations airth = new AirthmeticOperations();

        System.out.println("\n Airthmetic operations on integers:- \n");
       System.out.println("Addition of " + x + " and " + y + " is: " + airth.add(x,y));
       System.out.println("Subtraction of " + y + " from " + x + " is: " + airth.sub(x,y));
       System.out.println("Multiplication of " + x + " and " + y + " is: " + airth.mul(x,y));
       System.out.println("Quiotent of " + x + " and " + y + " is: " + airth.div(x,y));

       System.out.println("\n Airthmetic operations on float values:- \n");
       System.out.println("Addition of " + x1 + " and " + y1 + " is: " + airth.fadd(x1,y1));
       System.out.println("Subtraction of " + y1 + " from " + x1 + " is: " + airth.fsub(x1,y1));
       System.out.println("Multiplication of " + x1 + " and " + y1 + " is: " + airth.fmul(x1,y1));
       System.out.println("Quiotent of " + x1 + " and " + y1 + " is: " + airth.fdiv(x1,y1));

       System.out.println("\n Airthmetic operations on double values:- \n");
       System.out.println("Addition of " + x2 + " and " + y2 + " is: " + airth.dadd(x2,y2));
       System.out.println("Subtraction of " + y2 + " from " + x2 + " is: " + airth.dsub(x2,y2));
       System.out.println("Multiplication of " + x2 + " and " + y2 + " is: " + airth.dmul(x2,y2));
       System.out.println("Quiotent of " + x2 + " and " + y2 + " is: " + airth.ddiv(x2,y2));
   }

}

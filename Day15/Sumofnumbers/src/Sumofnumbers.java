/*
    Expand the method sum in the exercise template so that it calculates and returns the sum of the numbers
    that are given as the parameters. If the sum of the numbers are greater than 50 then print “The number
    is greater than 50” or vice versa.
    Date: October 16, 2020
    Module: 3, Day 15 - Conditions and Loops
 */

import java.util.*;


public class Sumofnumbers
{

    public Sumofnumbers()
    {

    }
    public int add (int a, int b)
    {
        return a+b;
    }

    public float fadd (float a, float b)
    {
        return a+b;
    }
    public double dadd (double a, double b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {

        int x, y;
        float x1 = 10.50f, y1 = 5.25f;
        double x2 = -100.50d, y2 = 50.25d;
        x = 50;
        y = 20;

        Sumofnumbers airth = new Sumofnumbers();
        int res = airth.add (x,y);
        float fres =airth.fadd(x1,y1);
        double dres=airth.dadd (x2,y2);


        System.out.println("\n Airthmetic operations on integers");
        System.out.println("\n Addition of " + x + " and " + y + " is: " + res);
        if (res > 50)
        {
            System.out.println("\n The sum of " + x + " and " + y + " is greater than 50 ");
        }
        System.out.println("\n *******************************************************\n\n");
        System.out.println("\n Airthmetic operations on float values ");
        System.out.println("\n Addition of " + x1 + " and " + y1 + " is: " + fres);
        if (fres > (float) 50)
        {
            System.out.println("\n The sum of " + x + " and " + y + " is greater than 50 ");
        }
        System.out.println("\n *******************************************************\n\n");
        System.out.println("\n Airthmetic operations on double values");
        System.out.println("\n Addition of " + x2 + " and " + y2 + " is: " + dres);
        if (dres > (double) 50)
        {
            System.out.println("\n The sum of " + x + " and " + y + " is greater than 50 ");
        }
        System.out.println("\n *******************************************************\n\n");
    }

}

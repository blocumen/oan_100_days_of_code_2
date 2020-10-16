/*
    Write a method public static void divisible By Three in Range (int beginning, int end)
    that prints all the numbers divisible by three in the given range. The numbers are to be
    printed in order from the smallest to the greatest.
    Date: October 16, 2020
    Module: 3, Day 15 - Conditions and Loops

 */

import java.util.*;


public class NumberDivision

{
     NumberDivision( int x, int y)
    {
        int x1= x;
        int y1 = y;
    }


    public  void  Divisibleby3inrange (int a, int b)
    {
        for (int i= a;i<b; i++ )
        {
            if (i % 3 == 0)
            {
                System.out.print(" " + i + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        int initial = 5;
        int end = 250;
        NumberDivision  numd = new NumberDivision(initial, end);
        System.out.println("\nThe numbers which are divisble by 3 in the range " + initial + " and " + end + " are: " );
        numd.Divisibleby3inrange(initial, end);

    }
}

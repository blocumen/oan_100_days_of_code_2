/*
    byte->short->int->float->double
    Try making widening(left to right) and narrowing(right to left) typecasting by creating
    variables with this types byte->short->int->float->double
    Module -2 Day 21
    Date: 25 /oct /2020

 */



import java.util.*;

public class Day21
{
    public void downcast (double db)
    {
        System.out.println("\n\n*************Download Casting**********");
        System.out.println("Number in double is:- "+ db);
        System.out.println("Number representation  after type casting is as shown under"+ db);
        System.out.println("to float 	: "+(float) db);
        System.out.println("to int 		: "+(int) db);
        System.out.println("to short 	: "+(short) db);
        System.out.println("to byte 	: "+(byte) db);
    }
    public void upcast(byte b)
    {
        System.out.println("\n\n*************UpCasting**********");
        System.out.println("Number in byte is:- "+ b);
        System.out.println("Number representation  after type casting is as shown under"+ b);
        System.out.println("to short 	:"+(short) b);
        System.out.println("to int 		:"+(int) b);
        System.out.println("to float 	:"+(float) b);
        System.out.println("to double 	:"+(double) b);
    }

    public static void main(String[] args)
    {
        double 	doub =0;
        byte 	by =0;

        Day21 dobj = new Day21();
        System.out.println("\n Enter a number in double :");
        Scanner myObj = new Scanner(System.in);
        doub = myObj.nextDouble();
        System.out.println("\n Enter a number in byte :");
        by = myObj.nextByte();
        dobj.downcast(doub);
        dobj.upcast(by);

    }

}





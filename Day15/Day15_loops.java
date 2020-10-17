/*
    Module 3 - Day 15
    Conditional and Loops

    Write a method public static void divisible By Three in Range (int beginning, int end) that prints all the
    numbers divisible by three in the given range. The numbers are to be printed in order from the smallest to the greatest.
*/
import java.util.Scanner;

public class Day15_loops {
    public static void divisibleByThreeInRange(int beginning, int end) {
        for(int i = beginning; i <= end; i++)
            if(i % 3 == 0)
                System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Program to print numbers divisible by 3 in a given range -");
        System.out.println("Enter the beginning of the range: ");
        int start = reader.nextInt();
        System.out.println("Enter the end of the range: ");
        int end = reader.nextInt();

        System.out.println("Numbers divisible by 3 between " + start + " and " + end + ":");
        divisibleByThreeInRange(start, end);
    }
}

package myPackage;

import java.util.Scanner;

public class MyClass {
    static String input;

    public static void main (String[] args) {
        getName();

    }

    //method
    public static void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to print? ");
        input = scanner.next();
        System.out.println(input);
    }
}

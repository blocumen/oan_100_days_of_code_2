package myPackage;
import java.util.Scanner;

public class MyClass {
    public static void getNames(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = read.nextLine();
        System.out.println("Your name is " +name);
    }


}

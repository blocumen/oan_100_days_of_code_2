import java.util.*;

public class Math {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter second number- ");
        int b= sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.println("The sum of the numbers provided is= " +c);
        System.out.println("The difference between the numbers provided is= " +d);
        System.out.println("The product of the numbers provided is= " +e);
        System.out.println("The quotient is= " +f);
    }
}
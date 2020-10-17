import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {
        
        int num1, num2, sum, diff, prod, quot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;
        quot = num1 % num2;
        
        System.out.println("Sum of these numbers: "+sum);
        System.out.println("Difference of these numbers: "+diff);
        System.out.println("Product of these numbers: "+prod);
        System.out.println("Quotent of these numbers: "+quot);
    }
}

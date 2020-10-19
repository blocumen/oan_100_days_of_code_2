import java.util.Scanner;

public class conditionals {
    public static void main (String[] args) {
        double num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = scanner.nextDouble();

        System.out.println("Numbers divisible by 3 are: ");
        for(int i=0; i<=num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
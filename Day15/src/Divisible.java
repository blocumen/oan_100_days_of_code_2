

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter lowest number in your range: ");
        int a = sc.nextInt();
        System.out.print("Enter highest number in your range: ");
        int b = sc.nextInt();

        //int array [];
        System.out.println("Numbers divisible by 3 in the range provided by you are: ");
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
    }
}

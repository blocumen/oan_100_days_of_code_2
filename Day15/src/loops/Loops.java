package loops;

import java.util.Scanner;

public class Loops {

    public static void divisibleByThreeInRange(int beginning,int end,int number) {
        for (int i = beginning; i <= end; i++){
            if (i % number == 0)
                System.out.print(i + ",");
            }

    }
    public static void main(String[] args){
        int beginning;
        int end;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter beginning number :");
        beginning=sc.nextInt();

        System.out.println("Please enter end number :");
        end=sc.nextInt();

        System.out.println("Please enter divisible number :");
        number= sc.nextInt();

        divisibleByThreeInRange(beginning,end,number);

    }
}

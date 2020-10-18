import java.util.Scanner;

public class Divby3Range {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower and upper limit  numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        divby3(a,b);
    }
    static void divby3(int a, int b)
    {
        for (int i=a;i<=b;i++)
        {
            if(i % 3 == 0) {
                System.out.print( i + "\t");
            }

        }
    }
}

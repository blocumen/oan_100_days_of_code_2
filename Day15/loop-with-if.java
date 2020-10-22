package calc;

//public class loop {
//    public static void main(String[] args) throws InterruptedException
//    {
//        int i;
//        for( i = 1; i <= 10 ;i++) {
//
//            System.out.println(i);
//        }
//    }
//}

import java.util.Scanner;

public class loop {
          public static void main(String[] args) {

              Scanner input = new Scanner(System.in);
              System.out.println("Please Enter the start range");
              int startRange = input.nextInt();
              System.out.println("Please Enter the end range");
              int endRange = input.nextInt();

              for (int i = startRange ; i < endRange ; i++)
              {

                  if (i % 3 == 0)
                  {
                      System.out.println(i);
                  }
              }

          }

      }
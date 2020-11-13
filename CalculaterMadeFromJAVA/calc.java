import java.lang.reflect.Array;
import java.util.Scanner;

public class calc {
    //private static int total;
    public static void main(String[] args) {
        System.out.println("you can do + ,  - , * , /");
        Scanner inp = new Scanner(System.in);
        String userInput = inp.next();
        int total = 0;
        if (userInput.contains("+")) {
            //int total = 0;
            for (String output : userInput.split("\\+")) {
                total += Integer.parseInt(output);
            }
            //System.out.println(total);
        } // Addition
        else if (userInput.contains("-")) {
            String[] splitNum = null;
            splitNum = userInput.split("-");
            //int total = 0;
            for (int i=0 ; i < splitNum.length ; i++ )
            {
                if (i == 0)
                {
                    total = Integer.parseInt(splitNum[i]);
                }
                else if (i > 0)
                {
                    total = total - Integer.parseInt(splitNum[i]);
                }
            }
            //System.out.println(total);
//            }
//            int total = 0;
//            int i = 0;
//            for (String output : userInput.split("-")) {
//                //System.out.println(total);
//                if (i > 0) {
//
//                    total = total - Integer.parseInt(output);
//                }
//                else {
//                    total = Integer.parseInt(output);
//                }
//                i++;
//            }





        } // Sub
        else if (userInput.contains("*")) {

            for (String output : userInput.split("\\*")) {
                if (total == 0 )
                {total = Integer.parseInt(output);}
                else {
                    total *= Integer.parseInt(output);
                }
            }

        } // multiply
        else if (userInput.contains("/")) {

            for (String output : userInput.split("/")) {
                if (total == 0 )
                {total = Integer.parseInt(output);}
                else {
                    total /= Integer.parseInt(output);
                }
            }

        } // Divide
        System.out.println(total);

    } // main function is ending

} // class end


// YAHOOoooooo created the calculator in java
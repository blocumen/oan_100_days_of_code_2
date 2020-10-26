package mypackage;
import java.util.*;
public class Myclass
{
    public static void getNames(String name) {
        System.out.println("The name entered by you is \""+name+"\"");
    }
    public static void main(String ... a)
    {
        System.out.println("Please enter the name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Myclass obj = new Myclass();
        getNames(name);
    }

}

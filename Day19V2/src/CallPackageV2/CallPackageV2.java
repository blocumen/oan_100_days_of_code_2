package CallPackageV2;
import myPackageV2.*;
import java.util.Scanner;
import static myPackageV2.MyClassV2.getNames;

public class CallPackageV2 {
    
        static String name;
        
        public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");
            name = input.next(); 
            getNames(name); 
        }
}

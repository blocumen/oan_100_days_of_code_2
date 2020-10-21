import myPackage.*; // importing external package
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();

        obj.getNames(name); // call the method in the other package
    }
}

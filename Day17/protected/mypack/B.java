package mypack;
import pack.*;

public class B extends A{
    public static void main(String[] args) {
        B obj = new B(); // Compile time error
        obj.msg(); // Compile time error
    }
}

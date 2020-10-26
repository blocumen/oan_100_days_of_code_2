import java.util.*;
class A{
    private int a = 10;
    private void msg()
    {
        System.out.println("Hi there this is private you can't access");
    }
}
public class Simple {
    public static void main(String[] args)
    {
        System.out.println("In class A ....");
        A obj = new A();
        System.out.println(obj.a); //java: a has private access in Simple
        obj.msg(); //java: msg() has private access in Simple
    }
}

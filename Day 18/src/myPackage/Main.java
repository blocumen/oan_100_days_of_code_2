package myPackage;

public class Main
{
    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        Main t = new Main();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + Main.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[])
    {
        Main t = new Main();
        t.method1(5);
    }
}

public class Simple {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.data); // Compile time error
        obj.msg(); // Compile time error
    }
}

public class Examples {

    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        String firstName = "Nikhil";
        String lastName = "Shevade";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);

        String txt5 = "It\'s alright.";
        System.out.println(txt5);

        String txt6 = "The character \\ is called back slash.";
        System.out.println(txt6);

        int x = 10;
        int y = 20;
        int z = x + y;      // z will be 30 (an integer/number)
        System.out.println(z);

        String a = "10";
        String b = "20";
        String c = a + b;   // c will be 1020 (a String)
        System.out.println(c);

        String d = "10";
        int e = 20;
        String f = d + e;   // f will be 1020 (a String)
        System.out.println(f);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[1]); // Outputs BMW

        cars[1] = "Maruti";
        System.out.println(cars[1]); // Outputs Maruti

        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        char nikhil;
    }
}
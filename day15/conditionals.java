
public class conditionals {
    public static void main (string[] args) {
        double num1, num2, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter 2nd number: ");
        num2 = scanner.nextDouble();

        sum = num1 + num2;
        System.out.println("The sum of the two numers is: " + sum);

        if(sum > 50){
            System.out.println("The sum is greater than 50");
        } else {
            System.out.println("The sum is not greater than 50")
        }
    }
}
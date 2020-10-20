package Calculator;

/**
 * @author HGunjalli
 *
 */
public class Calci {
	public static void main(String[] args) {
		Operations op = new Operations();

		System.out.println("Sum of two numbers: " + op.sum(1, 2));
		System.out.println("Product of two numbers: " + op.product(2, 2));
		System.out.println("Division of two numbers: " + op.division(1, 2));
		System.out.println("Division with zero: " + op.division(1, 0));

	}
}

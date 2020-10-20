package Calculator;

/**
 * @author HGunjalli
 *
 */
public class Operations {
	public float sum(float num1, float num2) {
		return num1 + num2;
	}

	public float product(float num1, float num2) {
		return num1 * num2;
	}

	public float division(float num1, float num2) {
		if (num2 == 0) {
			System.out.println("Division not possible with 0 as the divider");
			return Float.POSITIVE_INFINITY;
		} else {
			return num1 / num2;
		}
	}
}

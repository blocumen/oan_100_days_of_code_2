package Day22;

public class Car extends Vehicle {
	public String color;
	public int doorNumbers;
	

	public Car(String brand, String Registration,String color,int doorNumbers) {
		super(brand, Registration);
		this.color=color;
		this.doorNumbers= doorNumbers;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

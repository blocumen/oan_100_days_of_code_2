package CustomVehicle;
import Calculator.Operations;

public class Bike extends Vehicle{
    private Operations op = new Operations();

    public Bike(float mileage, float horsepower) {
        super(2, mileage, horsepower);
    }

    public float increaseMileage(float multiplier) {
        return op.multiply(this.mileage, multiplier);
    }

    public float decreaseMileage(int divisor) {
        return op.divide(this.mileage, divisor);
    }

    public int addWheels(int extra_wheels) {
        return (int)op.sum(this.num_of_wheels, extra_wheels);
    }

    public float increaseHorsePower(int multiplier) {
        return op.multiply(this.horsepower, multiplier);
    }
}

package CustomVehicle;
import Calculator.Operations;

public class Car extends Vehicle{
    private Operations op = new Operations();

    public Car(float mileage, float horsepower) {
        super(4, mileage, horsepower);
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

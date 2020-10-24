package CustomVehicle;
import Calculator.Operations;

public class MakeCustomVehicle {
    public static void main(String[] args) {
        System.out.println("----------------------- MakeCustomVehicle -------------------------");
        Car car = new Car(50000, 90);
        System.out.println("Car object created with mileage: " + car.mileage + " and horsepower: " + car.horsepower);

        float new_mileage = car.increaseMileage(3);
        System.out.println("Mileage for car increased by 3 times. Final mileage: " + new_mileage);
        float new_hp = car.increaseHorsePower(4);
        System.out.println("Horsepower for car increased by 4 times. Final horsepower: " + new_hp);
        System.out.println();

        Bike bike = new Bike(18000, 9.8f);
        System.out.println("Bike object created with mileage: " + bike.mileage + " and horsepower: " + bike.horsepower);

        float new_bike_mileage = bike.increaseMileage(2);
        System.out.println("Mileage for bike increased by 2 times. Final mileage: " + new_bike_mileage);
        float new_bike_hp = bike.increaseHorsePower(2);
        System.out.println("Horsepower for bike increased by 2 times. Final horsepower: " + new_bike_hp);

        System.out.println();
        System.out.println("Car details-");
        System.out.println("Mileage: " + car.mileage);
        System.out.println("Num of wheels: " + car.num_of_wheels);
        System.out.println("Horsepower: " + car.horsepower);
        System.out.println();
        System.out.println("Bike details-");
        System.out.println("Mileage: " + bike.mileage);
        System.out.println("Num of wheels: " + bike.num_of_wheels);
        System.out.println("Horsepower: " + bike.horsepower);
        System.out.println("-------------------------------------------------------------------");
    }
}

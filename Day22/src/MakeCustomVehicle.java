import CustomVehicle.*;
import CustomVehicle.Car;
import CustomVehicle.Bike;
import calculator.*;

public class MakeCustomVehicle {   
        
    public static void main(String[] args) { 
        int car_wheels=4, bike_wheels=2;
        
        Car myCar = new Car(car_wheels,50000,56.7,3);//wheels, miles, hp, mile_increase
        
        printCarOrBikeDetails("Original details of Car", 50000, car_wheels, 56.7);
        double increasedMileageCar = myCar.increaseMileage(3);
        double increasedHPCar = myCar.increaseHP(4);    
        printCarOrBikeDetails("Revised details of Car", increasedMileageCar, car_wheels, increasedHPCar );
        
        Bike myBike = new Bike(bike_wheels, 2000, 60.2, 2);
        
        printCarOrBikeDetails("Original details of Bike", 2000, bike_wheels, 60.2);
        double increasedMileageBike = myBike.increaseMileage(3);
        double increasedHPBike = myBike.increaseHP(4); 
        printCarOrBikeDetails("Revised details of Bike", increasedMileageBike, bike_wheels, increasedHPBike );
        }
    public static void printCarOrBikeDetails(String customVehicle, double increasedMileage, int wheels, double increasedHP ){
            System.out.println("Custom Vehicle: " +customVehicle );
            System.out.println("\t Mileage is: " +increasedMileage );
            System.out.println("\t Wheels : " + wheels );
            System.out.println("\t HorsePower : " +increasedHP );
        }
    }

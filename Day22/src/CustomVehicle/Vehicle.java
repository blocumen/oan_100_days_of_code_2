//Parent Class
package CustomVehicle;
import calculator.Operations;

/**
 *
 * @author eleqsr
 */
public class Vehicle {
    int num_of_wheels, mileage;
    double horsePower;
    
    public Vehicle(int wheels, int miles, double hp) {
        this.num_of_wheels = wheels;
        this.mileage = miles;
        this.horsePower = hp;
        //Operations oper = new Operations();
    }    
    /*  
    public static void main(String[] args) { 
        //Vehicle newVeh = new Vehicle(4, 50000, 50);
    }
    */
}
/*
class Car extends Vehicle{
    
    int frequency, update_wheels;
    double product, quotient;
        
    public Car(int whl, int mls, double hrspow, int freq){
        super(whl, mls, hrspow);
        this.frequency = freq;
    }
           
    double  increaseMileage(int freq){
        product = Operations.multiply((double) super.mileage, (double) freq);
        return( product );
    }
       
    double  decreaseMileage(int freq){
    quotient = Operations.div((double) super.mileage, (double) freq);
    return(  quotient  );
    }
    
    int addWheels(int extra_wheels){
        update_wheels =  Operations.add(num_of_wheels, extra_wheels);
        return(update_wheels);
    }
}
*/
/*
class Bike extends Vehicle{
    int frequency, update_wheels;
    double product, quotient;
        
    public Bike(int whl, int mls, double hrspow, int freq){
        super(whl, mls, hrspow);
        this.frequency = freq;
    }
           
    double  increaseMileage(int freq){
        product = Operations.multiply((double) super.mileage, (double) freq);
        return( product );
    }
       
    double  decreaseMileage(int freq){
    quotient = Operations.div((double) super.mileage, (double) freq);
    return(  quotient  );
    }
    
    int addWheels(int extra_wheels){
        update_wheels =  Operations.add(num_of_wheels, extra_wheels);
        return(update_wheels);
    }
}
*/





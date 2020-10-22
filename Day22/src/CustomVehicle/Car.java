package CustomVehicle;
import CustomVehicle.Vehicle.*;
import calculator.*;

public class Car extends Vehicle{
    
    int frequency, update_wheels;
    double product, quotient;
        
    public Car(int whl, int mls, double hrspow, int freq){
        super(whl, mls, hrspow);
        this.frequency = freq;
    }
    
    public double  increaseMileage(int freq){
        product = Operations.multiply((double) super.mileage, (double) freq);
        return( product );
    }
       
    public double  decreaseMileage(int freq){
    quotient = Operations.div((double) super.mileage, (double) freq);
    return(  quotient  );
    }
    
    public int addWheels(int extra_wheels){
        update_wheels =  Operations.add(num_of_wheels, extra_wheels);
        return(update_wheels);
    }
    
    public double increaseHP(int freq){
        product = Operations.multiply((double) super.mileage, (double) freq);
        return( product );
    }
}

package parkingms;

import block.Block;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    protected Integer lots;
    protected Integer Currentholding;
    public static ArrayList<vehicle> vehiclelist = new ArrayList<vehicle>();

    ParkingLot(Integer lots){
        this.lots = lots;
    }

    public Boolean Park(String Registrationnumber){

        vehiclelist.add(new vehicle("test",Registrationnumber));
        return true;
    }

    public Boolean Unpark(){
        return true;
    }

    public void ListofCurrentPark(){
        System.out.println("List of current park");
        for (vehicle v : vehiclelist) {
            System.out.println(v.Show(v));
        }
    }

    public void SpaceLeft(){
        System.out.println(this.lots - vehiclelist.size());
    }

}

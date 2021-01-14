package parkingms;

public class vehicle {
    protected String brand;
    protected String registration_number;

    vehicle(String brand, String registration_number){
        this.brand = brand;
        this.registration_number = registration_number;
    }

    protected String getVehicleType(){
        char ch1 = this.registration_number.charAt(0);
        switch(ch1){
            case 'M' : return "Motorbike";
            case 'T' : return "Truck";
            case 'C' : return "Car";
            default : return "can't say";
        }
    }

    @Override
    public boolean equals(Object obj) {
        vehicle other = (vehicle) obj;
        return this.registration_number.equals(other.registration_number);
    }

    public String Show(vehicle v){
        return this.registration_number;
    }
}

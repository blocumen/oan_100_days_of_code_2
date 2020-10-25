public class Bike extends  Vehicle{

    public int engineSize;
    public Bike(String brand, int regNumber, int engineSize ){
        super.vBrand =brand;
        super.vRegnumber="B"+regNumber;
        this.engineSize = engineSize;
    }
    public void display(){
        System.out.println("Details of the Bike is");
        super.display();
        System.out.println("Engine Size is: "+engineSize);

    }
}

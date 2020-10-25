public class Truck extends Vehicle {
    public int cargoVolume;
    public Truck(String brand, int regNumber ,int cargoVolume ){
        super.vBrand =brand;
        super.vRegnumber="T"+regNumber;
        this.cargoVolume= cargoVolume;

    }
    public void display(){
        System.out.println("Details of the Truck is");
        super.display();
        System.out.println("Cargo volume:"+cargoVolume);
    }
}

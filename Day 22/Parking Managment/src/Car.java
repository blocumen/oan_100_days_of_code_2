public class Car extends Vehicle {

    public int doors;
    public String color ;
    public Car(String brand, int regNumber ,int doors, String color ){
        super.vBrand =brand;
        super.vRegnumber="C"+regNumber;
        this.doors= doors;
        this.color= color;
    }
    public void display(){
        System.out.println("Details of the Car is");
      super.display();
      System.out.println("Number of doors: "+doors);
      System.out.println("Color: "+color);
    }
}

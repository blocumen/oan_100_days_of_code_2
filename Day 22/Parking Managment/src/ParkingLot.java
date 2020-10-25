import java.util.Scanner;

public class ParkingLot {
    public static final int maxslots=7;
    public static int currentFullSLots=0;

    public Vehicle v[] = new Vehicle[7];
    public void park(Vehicle v){
        v.display();
        if(maxslots>currentFullSLots) {
            currentFullSLots++;
            this.v[currentFullSLots] = v;
            System.out.println("vehicle successfully parked");

        }
        else
        {
            System.out.println("Parking is full");
        }
    }
    public void unpark(String regNumb){
        int i;
        boolean found =false;
        for (i=1;i<=currentFullSLots;i++) {
            if (v[i].vRegnumber.equals(regNumb)) {
                found = true;
                System.out.println("vehicle found " +regNumb);
                break;
            }
        }
        if (found) {
            System.out.println("vehicle unparked is ");
            v[i].display();
            for (int j = i; j < currentFullSLots; j++) {
                v[j] = v[j + 1];
            }
            currentFullSLots--;
        }
        else
        {
            System.out.println("Vehicle not found");
        }

    }
    public void displayparkedVehicle (){
        System.out.println("the parked vehicles are :");
         for (int i=1;i<=currentFullSLots;i++)
         {
             System.out.println("Vehicle :"+i);
             v[i].display();
         }
    }
    public int spaceleft(){
        return maxslots-currentFullSLots ;
    }

    public static void main(String[] args){
        ParkingLot p = new ParkingLot();
        int i =1;
        do {
            System.out.println("\n\n");
            System.out.println("Welcome to Parking ");
            System.out.println("Enter 1 to park Bike\nEnter 2 to park car\nEnter 3 to park truck\n Enter 4 to unpark \nEnter 5 to display parked vehicles\n Enter 6 to display space left\n Enter 7 to exit ");
            Scanner sc =new Scanner(System.in);
            int choiceVechile = sc.nextInt();
            switch (choiceVechile){
                case 1 :
                    System.out.println("Enter brand name , reg number (in Int without letters), engine size");
                    String bname=sc.next();
                    int regnum = sc.nextInt();
                    int engsize =sc.nextInt();
                    Bike b = new Bike(bname,regnum,engsize);
                    p.park(b);
                    break;
                case 2:
                    System.out.println("Enter brand name , reg number (in Int without letters), no. of doors , color ");
                    bname=sc.next();
                    regnum = sc.nextInt();
                    int doors =sc.nextInt();
                    String color = sc.next();
                    Car c= new Car(bname,regnum,doors,color);
                    p.park(c);
                    break;
                case 3:
                    System.out.println("Enter brand name , reg number (in Int without letters), voulume of vargo ");
                    bname=sc.next();
                    regnum = sc.nextInt();
                    int cargov =sc.nextInt();

                    Truck t= new Truck(bname,regnum,cargov);
                    p.park(t);
                    break;
                case 4:
                    System.out.println("Enter ur reg Number of vehicle ex: B45 or C32 or T432");
                    String vnumb =sc.next();
                    p.unpark(vnumb);
                    break;
                case 5:
                    p.displayparkedVehicle();
                    break;
                case 6:
                    System.out.println(p.spaceleft());
                    break;
                case 7:
                    i=0;
                    break;



            }


        }while( i==1);
    }
}

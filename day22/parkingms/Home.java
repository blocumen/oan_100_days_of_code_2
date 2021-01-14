package parkingms;

import java.util.Scanner;

public class Home {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Initiate Parking space with number of spaces : ");
        Integer num1= sc.nextInt();
        sc.nextLine();
        ParkingLot pl = new ParkingLot(num1);

        int ch = 7;

        do{
            System.out.print(" 1. Add vehicle ");
            System.out.print(" 2. Remove vehicle ");
            System.out.print(" 3. List of vehicle ");
            System.out.print(" 4. Empty Space ");
            System.out.print(" 0. quit ");

            ch= sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1 : {
                    System.out.print("Enter registration number");
                    String Registrationnumber;
                    Registrationnumber = sc.nextLine();
                    pl.Park(Registrationnumber);
                    break;
                }
                case 2 : {
                    System.out.print("Feature to be added soon");
                    break;
                }
                case 3 : {
                    pl.ListofCurrentPark();
                    break;
                }
                case 4 : {
                    pl.SpaceLeft();
                    break;
                }
                case 0 : {
                    break;
                }
                default:{
                    break;
                }
            }
        }while (ch != 0);
    }
}

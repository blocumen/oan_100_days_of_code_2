class Unicorn {

    int height = 170;   //Class Variables
    String power = "Double.Infinity";   //Class Variables

    //methods
    public void sleep() {
        int minutesToSleep = 120;   //object variable
        //attempt to check the scope of variable
        System.out.println(minutesToSleep);
        System.out.println(minutesToRun); //gives error: trying to access object variable of method run
        System.out.println(height);
        System.out.println(power);
    }

    public void run() {
        int minutesToRun = 60;  //object variable
        //attempt to check the scope of variable
        System.out.println(minutesToSleep); //gives error: trying to access object variable of method sleep
        System.out.println(minutesToRun);
        System.out.println(height);
        System.out.println(power);
    }


}


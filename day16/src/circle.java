
public class circle {                               //Identity of the object is "circle"

    public double radius;                           //State of the object is it's "radius"

    public double findDiameter() {                  //Behaviour of the object is the functions
        double diameter = 2 * radius;
        return diameter;
    }

    public double findArea() {                      //Behaviour of the object is the functions
        double area = 3.14 * radius * radius;
        return area;
    }
}

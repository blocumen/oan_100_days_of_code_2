/*
    Let's take a look at a car manufacturing system that manages car parts.
    A basic component of part management is the class Part, which defines the identifier,
    the manufacturer, and the description.

    One part of the car is the engine. As is the case with all parts, the engine, too, has a manufacturer, an identifier,
     and a description. In addition, each engine has a type: for instance, an internal combustion engine,
     an electric motor, or a hybrid engine.

 */

package DAY20;

import java.util.Scanner;

public class car
{

    public class Part
    {
        private String identifier;
        private String manufacturer;
        private String description;
        public Part()
        {
            //default constructor
        }
        public Part(String identifier, String manufacturer, String description)
        {
            this.identifier = identifier;
            this.manufacturer = manufacturer;
            this.description = description;
        }
        public String getIdentifier()
        {
            return identifier;
        }
        public String getDescription()
        {

            return description;
        }
        public String getManufacturer()
        {
            return manufacturer;
        }
    }


    public class Engine extends Part
    {

        //create the class Engine which inherits the class Part: an engine is a special case of a part

        protected String engineType;
        public Engine(String engineType, String identifier, String manufacturer, String description)
        {
            super(identifier, manufacturer, description);     //calls from base class
            this.engineType = engineType;
        }
        public String getEngineType()
        {
            return engineType;
        }
    }

    public void main (String args[])
    {
        Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturer());

    }
}

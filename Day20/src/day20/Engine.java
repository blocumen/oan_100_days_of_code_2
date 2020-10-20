/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day20;

class Part {
private String identifier;
private String manufacturer;
private String description;

    public Part(String identifier, String manufacturer, String description) {
    this.identifier = identifier;
    this.manufacturer = manufacturer;
    this.description = description;
    }
    public String getIdentifier() {
    return identifier;
    }
    public String getDescription() {
    return description;
    }
    public String getManufacturer() {
    return manufacturer;
    }
}

public class Engine extends Part{
    private String engineType;
    
    public Engine(String engineType, String identifier, String manufacturer, String description) {
    
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    }
    
    public String getEngineType() {
        return engineType;
    }
    
        public static void main(String[] args) {
            Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
            System.out.println(engine.getEngineType());
            System.out.println(engine.getManufacturer());
    }
}

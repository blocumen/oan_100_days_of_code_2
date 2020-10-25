package Day20;

public class Engine extends Part {
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

package springs_xml;

public class Car {

	String manufacturer;
	double cost;
	Engine engine;
	public Car(String manufacturer, double cost, Engine engine) {
		super();
		this.manufacturer = manufacturer;
		this.cost = cost;
		this.engine = engine;
	}
	
	public void info() {
		System.out.println("Car [manufacturer=" + manufacturer + ", cost=" + cost + ", engine=" + engine + "]");
		engine.horsePower();
	}
	
	
	
	
}

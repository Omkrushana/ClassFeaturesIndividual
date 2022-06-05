package encapsulationPractice;

public class Main {
	void method() {
		Bike bike = new Bike();
		bike.name = "R15";
		bike.brand = "yamaha";
		bike.color = "black";
		bike.setColor("Black");
		bike.getColor();
		bike.average = "30";
		
		bike.brake();
		bike.accelerate();
		bike.start();
		bike.stop();
	}



}

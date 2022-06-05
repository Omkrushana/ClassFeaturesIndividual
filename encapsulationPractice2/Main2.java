package encapsulationPractice2;

import encapsulationPractice.Bike;

public class Main2 extends Bike {
	void method() {
		Bike bike = new Bike();
		bike.name = "R15";
		bike.brand = "yamaha";
		bike.color = "black";
		average = "30";

		bike.brake();
		bike.accelerate();
		bike.start();
		bike.stop();
	}

}

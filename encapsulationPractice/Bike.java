package encapsulationPractice;

public class Bike {
	// access modifier
	private String color; // class
	String name; // package
	protected String average; // inheritance child class + same package
	public String brand;// everywhere in project

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private void brake() {
		color = "black";
	}

	void accelerate() {
		brake();
	}

	protected void start() {
	}

	public void stop() {
	}

}

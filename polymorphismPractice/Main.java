package polymorphismPractice;

public class Main {

	public static void main(String[] args) {
		Yamaha yamahabike = new Yamaha();
		yamahabike.brake();
		
		Bike brake = new Bike();
		brake.brake();

	}

}

package InheritancePractice;

public class Main {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		bike.stop();
		
		Honda hondacar = new Honda();
		hondacar.start();
		hondacar.stop();
		hondacar.startMusic();
		hondacar.reverseView();
		
		Yamaha yamahabike = new Yamaha();
		yamahabike.start();
		yamahabike.stop();

	}

}

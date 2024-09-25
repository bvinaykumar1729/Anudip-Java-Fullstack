package abstractionExamples;

abstract class Vehicle{
	public void engine() {
		System.out.println("Engine has started.");
	}
	public  abstract void start();
}
class Bike extends Vehicle{
	public  void start() {
		System.out.println("Bike has started.");
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		Vehicle bikeObject = new Bike();
		bikeObject.start();
		bikeObject.engine();

	}

}

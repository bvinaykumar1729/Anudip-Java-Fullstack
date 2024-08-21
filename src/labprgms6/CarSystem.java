package labprgms6;

class Car{
	// a method for Engine
	public void Engine() {
		System.out.println("This is Petrol engine ");
	}
	// a method for accelerator
	public void accelerator() {
		System.out.println("Speed increased of the car");
	}
	//a method for breaks
	public void breaks() {
		System.out.println("Car has stopped");
	}
	
}
//---------------------------------------------------
// a class for Mahindra car which extends car class
class Mahindra extends Car{
	public void navigator() {
		System.out.println("3D navigation System is on");
	}
	//a method  is to find blindspots
	public void blindSpotMonitor() {
		System.out.println("Blind Spot Monitor is activated");
	}
	
	// a method for dolbyAtoms system
	public void dolbyAtoms() {
		System.out.println("DolbyAtoms sound system activated ");
	}
	// a method for ABS
	public void AntiLockBrakingSystem() {
		System.out.println("This car has Anti-lock Braking System (ABS)");
	}
}

//-------------------------------------------------------------
//initial class
public class CarSystem {

	public static void main(String[] args) {
		// creating object to mahindra class
	Mahindra thar = new Mahindra();
	// calling  methods of car class engine,accelerator,breaks
	thar.Engine();
	thar.accelerator();
	thar.breaks();
	

	}

}

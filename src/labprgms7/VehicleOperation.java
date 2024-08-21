package labprgms7;
 
//--------------------------------------
// created a class vehicle
class Vehicle {
	//-------------------------------------
	// created member variables make,model
	String make;
	String model;
	
	//----------------------------------------
	//created a parameterized constructor with make,model
	Vehicle(String make,String model) {
		this.make=make;
		this.model=model;
		//printing make and model fields
		System.out.println("make: "+make);
		System.out.println("model: "+model);
	}
}
//---------------------------------------------
//created a class Car which extends Vehicle class
class Car extends Vehicle{
	//declared year field 
	int year;
	
	//--------------------------------------
	//created a parameterized constructor with make ,model and year fields
	Car(String make ,String model,int year){
	//calling parent class constructor Vehicle with the help of super keyword
		super(make,model);
		this.year=year;
		//printing year field
		System.out.println("year: "+year);
	}
}
//initial class created VehicleOperation
public class VehicleOperation {

	public static void main(String[] args) {
//created an Object with name nanoCar to Car class to invoke constructor 
		Car nanoCar =new Car("TATA","Nano",2012);
	}

}

package labprgms7;

//--------------------------------------------------------------
//created class named as Person
class Person{
	//created name ,age fields 
	String name;
	int age;
	
	//------------------------------------------
	// Initialized constructor with parameter
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}

}

//---------------------------------------------------------------
//Created a class with name Employee which extends Person class
class Employee extends Person{
	//created a employeeId field
	int employeeId;
	
	//--------------------------------------------
	//Initialized Employee constructor with name,age and employeeId parameters
	Employee(String name,int age,int employeeId)
	{
		super(name,age);// Calling parent class Constructor
		this.employeeId =employeeId;
		// calling dispalyEmployeeInfo method
		displayEmployeeInfo();
		
	}
	
	// a method created to print details of an employee
	public void displayEmployeeInfo(){
		System.out.println("Employee Details are :");
		System.out.println("------------------------------------------");
		System.out.println("Employee name is: "+name);
		System.out.println("Employee age is: "+age);
		System.out.println("Employee ID is: "+employeeId);
	}
}
//Initial class
public class PersonInfo {

	public static void main(String[] args) {
		Employee EmployeeOne = new Employee("B.Vinaykumar",23,1);

	}

}

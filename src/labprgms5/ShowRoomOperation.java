package labprgms5;
import java.util.*;

//---creating a class ShowRoom
class ShowRoom{
	//--- member variables
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	
	//constructor 
	public ShowRoom(){
		// initializing member variables
	name ="USER";
	mobno=000000000;
	cost =0.0;
	dis =0.0;
	amount =0.0;
		
	}
	//-------------------------------------------------------------------
	//----- a method to take input from the user----------------------------
	public void input() {
		// creating object to the Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Customer");
		// taking input from keyboard
		name =sc.next();
		System.out.println("Enter the mobile number of Customer");
		mobno = sc.nextLong();
		System.out.println("Enter the total cost");
		cost =sc.nextDouble();
		
	}
	
	//---------------------------------------------------------
	// a method for calculate discount after amount according to cost
	public void calculate() {
		// comparing cost
		if(cost <= 10000) {
			dis= (5.0/100)*cost;
			
		}
		else if(cost>10000 && cost<=20000) {
			dis=(10.0/100)*cost;
			
		}
		else if(cost>20000 && cost<=35000) {
			dis=(15.0/100)*cost;
			
		}
		else if(cost>35000) {
			dis=(20.0/100)*cost;
			
		}
		amount =cost-dis;
	}
	//---------------------------------------------------------
	// a method to displays user name,number,discount after amount
	public void display() {
		System.out.println("----------Total Billing------------------- ");
		System.out.println("Name of the customer is : "+name);
		System.out.println("---------------------------------------------");
		System.out.println("Mobile number of the customer is: "+mobno);
		System.out.println("---------------------------------------------");
		System.out.println("amount to be paid after discount is : "+amount);
		
	}
}
// initial class
public class ShowRoomOperation {

	public static void main(String[] args) {
		// creating an object to ShowRoom class
		ShowRoom customerOne = new ShowRoom();
		// a method for input
		customerOne.input();
		// a method for to calculate discount
		customerOne.calculate();
		// a method for to display data
		customerOne.display();

	}

}

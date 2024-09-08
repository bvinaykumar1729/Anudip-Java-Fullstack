package polymorphismExamples;
import java.util.Scanner;
//---------------------------------------------------
//creating order class
class Order{
	//member variables
	String orderName;
	String listOfItems[] =new String[5];
	
	//-------------------------------------------
	// a method for Ordering single item
	public void placeOrder(String orderName) {
		this.orderName=orderName;
		System.out.println("--------------------------------------------");
		System.out.println(" Order name is : "+orderName);
		System.out.println("--------------------------------------------");
	}
	
	//--------------------------------------
	//a method for Ordering multiple items
	public void placeOrder() {
		//creating object to Scanner class
		Scanner input = new Scanner(System.in);
		
		//asking input through user
		System.out.println(" Enter items names for order ");
		
		
		for(int i=0; i<listOfItems.length; i++) {
			String listOfOrders=input.nextLine();
			listOfItems[i]=listOfOrders;
		}
		System.out.println("List of Ordered Items are  :");
		for(int i=0; i<listOfItems.length; i++) {
			System.out.println(listOfItems[i]+" ,");
		}
		System.out.println("--------------------------------------------");
	}
	//------------------------------------------
	// creating a method for taking item name,quantity,special instructions
	public void placeOrder(String itemName,int itemQuantity ,String specialInstructions) {
		System.out.println("Item name is : "+itemName);
		System.out.println("Item Quantity is : "+itemQuantity);
		System.out.println("Special Instrctions are : "+specialInstructions);
	}
}
	
//---------------------------------------------------------
public class Restaurant {

	public static void main(String[] args) {
		Order firstOrder = new Order();
		firstOrder.placeOrder("Biryani");
		firstOrder.placeOrder();
		firstOrder.placeOrder("Chicken Drumsticks", 3, "Spicy with extra tamato flavour");
		
		

	}

}

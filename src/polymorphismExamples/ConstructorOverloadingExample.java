package polymorphismExamples;
import java.util.Scanner;
/*----- Defining a class ------*/
class Number
{
	/*---- member variables ------*/
	int num1,num2;
	/*----- Non-Parameterised Constructor -----*/
	Number()
	{
		/*---- Object of scanner class -----*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("----------------------------");
		sc.close();
	}
	/*----- Parameterised constructor ------*/
	Number(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	/*----- Method to display numbers -----*/
	public void displayNumbers()
	{
		System.out.println("First No. : "+num1);
		System.out.println("Second No. : "+num2);
	}
}
/*------------------------------------------------------------*/
public class ConstructorOverloadingExample {

	public static void main(String[] args) {
		//Creating object of Number class 
		Number obj1=new Number();
		System.out.println("----- Object id : "+obj1+"---------");
		obj1.displayNumbers();
		/*-------------------------------------------------*/
		obj1=new Number(12,70); // object is different  here
		System.out.println("----- Object id : "+obj1+"---------");
		obj1.displayNumbers();
		
		Number obj2 = new Number(34,68);
		obj2.displayNumbers();

	}

}

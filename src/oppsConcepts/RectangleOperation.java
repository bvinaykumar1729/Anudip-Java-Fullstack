package oppsConcepts;
import java.util.Scanner;

/*------ Defining a class for Rectangle ---------*/
class Rectangle
{
	/*---- Member variables -----*/
	private float length,breadth;
	/*-----------------------------------------*/
	/*--- Input of data through user ----*/
	public void inputSides()
	{
		/*--- creating object of scanner class -----*/
		Scanner sc=new Scanner(System.in);
		/*--- Input of data through keyboard -----*/
		System.out.print("Enter Length of Rectangle(in cm) : ");
		length = sc.nextFloat();
		System.out.print("Enter Breadth of Rectangle(in cm) : ");
		breadth = sc.nextFloat();
	}
	/*----------------------------------------------------------------------------------*/
	/*---- Method to Display data ------*/
	public void displaySides()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("----------- Rectangle -------");
		System.out.println("Length : "+length+" cm");
		System.out.println("Breadth : "+breadth+" cm");
	}
	/*---------------------------------------------------------------------------*/
	/*------ Method to calculate perimeter --------*/
	public void calculatePerimeter()
	{
		float perimeter; // variable to store perimeter
		perimeter = 2 *(length + breadth);
		System.out.println("Perimeter : "+perimeter+" cm");
	}
	/*------ Method to calculate area --------*/
	public void calculateArea()
	{
		float area; // variable to store area
		area = length * breadth;
		System.out.println("Area : "+area+" sq. cm");
	}
}
/*--------------------------------- Initial Class --------------------------------------*/
public class RectangleOperation {

	public static void main(String[] args) 
	{
		// Creating Object of Rectangle class
		Rectangle rectobj= new Rectangle();
		/*--- method for input of sides ----*/
		rectobj.inputSides();
		/*--- Method to display side of rectangle ----*/
		rectobj.displaySides();
		/*---- method of perimeter -----*/
		rectobj.calculatePerimeter();
		/*--- method of area -----*/
		rectobj.calculateArea();
	}
}


package labprgms7;

//------------------------------------------------------------------
//Created a class named as Shape
class Shape{
	
	//Created member variables color and filled
	String color;
	String filled;
	//----------------------------------
	//Initialized  parameterized constructor as named Shape along with color,filled fields
	Shape(String color,String filled){
		this.color=color;
		this.filled=filled;
		
		System.out.println("Color: "+color);
		System.out.println("filled: "+filled);
	}
}

//------------------------------------------------------------------
//Created a class named as Circle
class Circle extends Shape{
	
	//created member variables pi ,radius
	final float pi=3.14f;
	float radius;
	//-------------------------------------------------------
	//Initialized Constructor with color,filled ,radius fields
	Circle(String color,String filled,float radius)
	{
		super(color,filled);
		this.radius=radius;
		areaOfCircle(radius);
	}
	//-------------------------------
	//created a method to calculate are of circle
	public void areaOfCircle(float radius) {
		float area =pi*radius*radius;
		System.out.println("The Circle area is: "+area);
		System.out.println("--------------------------------");
	}
}

//-----------------------------------------------------------
//created a class Rectangle which extends Shape class
class Rectangle extends Shape{
	// created member variables length,width
	long length,width;
	
	//-----------------------------------------------------------
	// Initialized constructor with parameters
	Rectangle(String color,String filled,long length,long width){
		super(color,filled);//calling parent class constructor
		this.length=length;
		this.width=width;
		
  // invoked areaOfRectangle method passed  parameters as length and width
		areaOfRectangle(length,width);
		
	}
	//created a method to calculate area of Rectangle
	public void areaOfRectangle(long length,long width) {
		long area =length*width;//calculating area of rectangle
		//printing area of rectangle
		System.out.println("The Rectangle area is: "+area);
	}

}
//--------------------------------------------------------------
//Initial Class
public class ShapeOperation {

	public static void main(String[] args) {
//Created object to Circle class to invoke constructors
		Circle cirlceOne = new Circle("Blue","Totally",5f);
		Rectangle rectangleOne = new Rectangle("Black","Half",5,10);

	}

}

package polymorphismExamples;

class Perimeter{
	public void calculatePerimeter(float radius) {
		final float pi=3.14f;
		float perimeterOfCircle =2*pi*radius*radius;
		System.out.println("Radius of circle is : "+radius);
		System.out.println("Perimeter of the Circle is : "+ perimeterOfCircle);
		System.out.println("--------------------------------------------------");
		
	}
	public void calculatePerimeter(int side) {
		int perimeterOfSquare =4*side;
		System.out.println("Side of the Square is :"+side+" cm");
		System.out.println("Perimeter of the Square is : "+perimeterOfSquare+" sq.cm");
		System.out.println("-------------------------------------------------");
	}
	public void calculatePerimeter(int side1,int side2,int side3) {
		int perimeterOfTriangle =side1+side2+side3;
		System.out.println("sides of triangle are :");
		System.out.println("side1 : "+side1+" cm");
		System.out.println("side2 : "+side2+" cm");
		System.out.println("side3 : "+side3+" cm");
		System.out.println("Perimeter of  the Triangle is : "+perimeterOfTriangle+" sq.cm");
		System.out.println("------------------------------------------------------");
		
	}
	public void calculatePerimeter(float length,float breadth) {
		float perimeterOfrectangle =2*(breadth+length);
		System.out.println("Breadth : "+breadth+" cm");
		System.out.println("Lenght : "+length+" cm");
		System.out.println("Perimeter of Rectangle is : "+perimeterOfrectangle+" sq.cm");
	}
	
}
public class CalculatePerimeter {

	public static void main(String[] args) {
		Perimeter figure = new Perimeter();
		figure.calculatePerimeter(5f);
		figure.calculatePerimeter(5);
		figure.calculatePerimeter(3,4,5);
		figure.calculatePerimeter(2f, 4f);

	}

}

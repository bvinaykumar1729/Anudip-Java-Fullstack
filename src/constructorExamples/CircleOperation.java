package constructorExamples;

/*-----Definition of Circle class------------------*/
class Circle
{
	/*--------Member variable----------------*/
	float radius;
	/*------Parameterized constructor------*/
	Circle(float r){
		radius = r;
	}
	/*------method to display radius-------*/
	public void displayRadius() {
		System.out.println("Radius"+radius);
	}
	/*-----Method to calculate Perimeter-----*/
	public void calculatePerimeter() {
		float perimeter = 2*3.14f*radius;
		System.out.println("Perimeter of the circle is : "+perimeter);
	}
	/*-----Method to calculate Area-----*/
	public void calculateArea() {
		float area = 3.14f*radius*radius;
		System.out.println("Area of circle is : "+area);
	}
}

//initial class
public class CircleOperation {

	public static void main(String[] args) {
		Circle circleOne = new Circle(3);
		circleOne.calculateArea();
		circleOne.calculatePerimeter();

	}

}

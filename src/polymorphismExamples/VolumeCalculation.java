package polymorphismExamples;

class Shapes{
	final float pi=3.14f;
	public void volume(float radius,float height) {
		
		float volume =1.0f/3*(pi*radius*radius*height);
		System.out.println("Volume of cone is : "+volume);
	}
	//-------------------------------------------
	public void volume(float radius) {
		
		
		float volume =4.0f/3*(pi*radius*radius*radius);
		System.out.println("Volume of Sphere is : "+volume);
	}
	//--------------------------------------------
	public void volume(double radius,double height) {
		
		double volume =(pi*radius*radius*height);
		System.out.println("Volume of Cylinder is : "+volume);
	}
	//---------------------------------------------
	public void volume(int side) {
		
		int volume =(side *side*side);
		System.out.println("Volume of cube is : "+volume);
	}
}
public class VolumeCalculation {

	public static void main(String[] args) {
		Shapes shapeOne =new  Shapes();
		shapeOne.volume(5f,5f);
		shapeOne.volume(5f);
		shapeOne.volume(5.0,5.0);
		shapeOne.volume(5);
		
		

	}

}

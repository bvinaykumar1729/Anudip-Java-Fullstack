package abstractionExamples;
//created threeDFigure interface
interface ThreeDFigure{
	//created abstract methods curvedsurfaceArea,totalsurfacArea,volume
	public abstract void curvedsurfaceArea(float radius,float height);
	public abstract void totalsurfacArea(float radius,float height);
	public abstract void volume(float radius,float height);

}
//implementing ThreeDFigure interface by Cylinder class
class Cylinder implements ThreeDFigure{
	
	//Declared pi,radius,height variables
	float pi=3.14f,radius,height;
	//Defining display method to display height and radius of cylinder
	public void display() {
		//printing height and radius of Cylinder
		System.out.println("Radius of Cylinder: "+radius);
		System.out.println("Height of Cylinder: "+height);
	}

	@Override
	public void curvedsurfaceArea(float radius,float height) {

		this.height=height;
		this.radius=radius;
		//calling display method
		display();
		//---calculating curvedsurfaceArea of cylinder---
		float curvedsurfaceArea =2*pi*radius*height;
		System.out.println("--------------------------------------\n");
		//printing curvedsurfaceArea of cylinder---
		System.out.println("Curved SurfaceArea of cylinder: "+curvedsurfaceArea);
		System.out.println("--------------------------------------\n");

	}

	@Override
	public void totalsurfacArea(float radius,float height) {

		this.height=height;
		this.radius=radius;
		//---calculating totalsurfaceArea of cylinder---
		float totalsurfaceArea=2*pi*radius*(radius+height);
		//---printing totalsurfaceArea of cylinder---
		System.out.println("Total SurfacArea of cylinder: "+totalsurfaceArea);
		System.out.println("--------------------------------------\n");
	}

	@Override
	public void volume(float radius,float height) {
		this.height=height;
		this.radius=radius;
		//---calculating Volume of cylinder---
		float volume =pi*radius*radius*height;
		//---printing Volume of cylinder---
		System.out.println("Volume of Cylinder : "+volume);
	}

}
public class InterfaceDemo {

	public static void main(String[] args) {
		//created object of Cylinder class 
		Cylinder cylinderObject = new Cylinder();
		//calling curvedsurfaceArea,totalsurfacArea,volume methods passing as radius 5,height 10
		cylinderObject.curvedsurfaceArea(5, 10);
		cylinderObject.totalsurfacArea(5, 10);
		cylinderObject.volume(5, 10);
	}

}

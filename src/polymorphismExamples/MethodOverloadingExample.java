package polymorphismExamples;

/*------- defining a class for volume calculation------*/
class VolumeCalculator
{
	/*----- Method to calculate the volume of Cube ------*/
	public void calculateVolume(int side)
	{
		float volume = side * side * side;
		System.out.println("------- Cube -------");
		System.out.println(" Side : "+side+" cm");
		System.out.println(" Volume : "+volume+ "cubic cm");
	}
	/*----- Method to calculate the volume of sphere ------*/
	public void calculateVolume(float radius)
	{
		float volume = (4 * 3.14f * radius * radius * radius)/3;
		System.out.println("---------- Sphere --------");
		System.out.println(" Radius : "+radius+" cm");
		System.out.println(" Volume : "+volume+" cubic cm");
	}
	/*----- Method to calculate volume of cuboid ------ */
	public void calculateVolume(int length,int width,int height)
	{
		float volume = length * width * height;
		System.out.println("------ Cuboid --------");
		System.out.println("Length : "+length+" cm");
		System.out.println("Width :"+width+" cm");
		System.out.println("Height : "+height+" cm");
		System.out.println("Volume : "+volume+" cubic cm");
	}
	/*------ Method to calculate volume of cylinder ------*/
	public void calculateVolume(int radius,float height)
	{
		float volume = 3.14f * radius * radius * height;
		System.out.println("------ Cylinder --------");
		System.out.println(" Radius : "+radius+" cm");
		System.out.println(" Height : "+height+" cm");
		System.out.println("Volume : "+volume+" cubic cm");
	}
	/*------ Method to calculate volume of cone ------*/
	public void calculateVolume(float height,int radius)
	{
		float volume = (3.14f * radius * radius * height)/3;
		System.out.println("------ Cone --------");
		System.out.println(" Radius : "+radius+" cm");
		System.out.println(" Height : "+height+" cm");
		System.out.println("Volume : "+volume+" cubic cm");
	}
}
/*---------------------------------------------------------------*/
public class MethodOverloadingExample {

	public static void main(String[] args) 
	{
		//Creating the object of VolumeCalculator class
		VolumeCalculator vc=new VolumeCalculator();
		vc.calculateVolume(7.0f); // sphere
		vc.calculateVolume(10);   //cube
		vc.calculateVolume(10, 12, 20);//cuboid
		vc.calculateVolume(7.0f, 20);//cone
		vc.calculateVolume(15, 14.0f);//cylinder
	}
}



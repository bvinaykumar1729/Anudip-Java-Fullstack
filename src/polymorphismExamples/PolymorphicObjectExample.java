package polymorphismExamples;

/*----- Base class -------*/
class ThreeDFigure
{
	public void description()
	{
		System.out.println("It is three dimensional figure having three dimensions in shape");
	}
	/*---- Method of volume ------*/
	public void volume()
	{
		System.out.println("The volume of three dimensional figure specifies the amount of space it occupies");
	}
}
/*------------------------------------------------------------------------*/
/*------- creating a class with name cube */
class Cube extends ThreeDFigure
{
	float side;
	public void description()
	{
		System.out.println("---------------------- Cube ----------------");
		System.out.println("Cube is Three Dimensional figure having each dimension same in measurement");
		System.out.println("---------------------------------------------------------------------------");
	}
	public void totalSurfaceArea()
	{
		float tsa = 6 * side * side;
		System.out.println("Total Surface Area : "+tsa+" sq. cm");
	}
	/*------ Overriding volume method -------*/
	public void volume()
	{
		side =10;
		float v = side * side * side;
		System.out.println("Side :"+side+" cm");
		System.out.println("Volume : "+v+" cubic cm");
	}
}
/*------- creating a class with name cuboid */
class Cuboid extends ThreeDFigure
{
	float length,width,height;
	public void description()
	{
		System.out.println("---------------------- Cuboid ----------------");
		System.out.println("Cuboid is Three Dimensional figure having length, width and height");
		System.out.println("---------------------------------------------------------------------------");
	}
	/*------ Overriding volume method -------*/
	public void volume()
	{
		length =5;
		width =10;
		height = 15;
		float v = length * width * height;
		System.out.println("Length : "+length+" cm");
		System.out.println("Width : "+width);
		System.out.println("Height : "+height);
		System.out.println("Volume : "+v+" cubic cm");
	}
}
/*--------------------------------------------*/
public class PolymorphicObjectExample {

	public static void main(String[] args) {
		
		ThreeDFigure figure1 = new ThreeDFigure();
		figure1.description();
		figure1.volume();
		System.out.println("------------------------------------------------");
		/*------------------------------------------------*/
		// Polymorphic object
		ThreeDFigure figure2 = new Cube(); 
		/* Object has reference of base class but it has been initialized with derived class */
		figure2.description();
		figure2.volume();
		System.out.println("------------------------------------------------");
		/*------------------------------------------------*/
		ThreeDFigure figure3 = new Cuboid();
		figure3.description();
		figure3.volume();
		System.out.println("------------------------------------------------");		
	}
}


package methodsDemos;

public class MethodExample {
	/*---- Method to find out addition of two number -----*/
	public static void addition(int a, int b)
	{
	int sum = a + b;
	System.out.println("Sum of "+a+" and "+b+" is : "+sum);
	}
	/*----------------------------------------------------------*/
		public static void main(String[] args)
		{
		addition(10,5);
		addition(14,2);
		addition(200,400);
		addition(-120,30);
		addition(67,89);
		}

	}



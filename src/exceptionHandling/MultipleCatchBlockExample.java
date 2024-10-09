package exceptionHandling;

public class MultipleCatchBlockExample {

	public static void main(String[] args) {
		int[] numbers= {24,45,0,90,55};
		int num1 = 34;
		System.out.println("Division of numbers");
		for(int index =0; index<=numbers.length; index++) {
			try {
				System.out.println("On Dividing"+numbers[index]+" by "+num1);
				System.out.println("Quotient : "+(numbers[index]/num1));
				System.out.println("Remainder : "+(numbers[index]%num1));
				
			}catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("Array must have index less than length : "+ae);
			}catch(ArithmeticException are) {
				System.out.println("Unable to divible by zero"+are);
			}
		}

	}

}

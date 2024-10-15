package exceptionHandling;

public class MultipleExceptionsHandlingExample {

	public static void main(String[] args) {
		//declaring an integer type array
						int[] numbers= {24,45,0,90,55};
				int num1 = 34;
				System.out.println("Division of numbers");
				for(int index =0; index<=numbers.length; index++) {
					try {
						System.out.println("On Dividing"+numbers[index]+" by "+num1);
						System.out.println("Quotient : "+(numbers[index]/num1));
						System.out.println("Remainder : "+(numbers[index]%num1));
						
					}catch(ArrayIndexOutOfBoundsException | ArithmeticException exception) {
						System.err.println("Exception is occured : "+exception.getMessage());
					}
				}

			}
	}


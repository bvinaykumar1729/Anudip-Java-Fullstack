package labprgms2;

public class GreatestOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,num4,num5;
		num1=1;
		num2=2;
		num3=9;
		num4=4;
		num5=5;
		if(num1>num2 && num1>num3 && num1>num4 && num1>num5) {
			System.out.println("num1 is greater");
		}
		else if(num2>num1 && num2>num3 && num2>num4 && num2>num5) {
			System.out.println("num2 is greater");
		}
		else if(num3>num1 && num3>num2 && num3>num4 && num3>num5) {
			System.out.println("num3 is greater");
		}
		else if(num4>num1 && num4>num2 && num4>num3 &&num4>num5) {
			System.out.println("num4 is greater");
		}
		else {
			System.out.println("num5 is greater");
		}
	}
}
		
		

package conditionaldemo;

public class GreatestOfThree {

	public static void main(String[] args) {
		int a,b,c;
		a=9;
		b=56;
		c=30;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}
		else {
			if(b>c) {
				System.out.println("b is greater");
			}
			else {
				System.out.print("c is greater");
			}
		}

	}

}

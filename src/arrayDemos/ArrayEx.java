package arrayDemos;

public class ArrayEx {

	public static void main(String[] args) {
//creating an array of 10 integers and store following numbers 45,78,93,82,95,16,74,83,121,173 respectively
	/*-----------------------------------------------------*/
		/*-----------------------------------------*/
		/*-----declaration of array-----*/
		int[] number;
		/*-----initializing numbers of elements-----*/
		number = new int[10];
		/*-----------------------------------------*/
		/*---initializing  first element with 45 ---*/
		number[0]=45;
		/*---initializing  second element with 78 ---*/
		number[1]=78;
		/*---initializing  third element with 93 ---*/
		number[2]=93;
		/*---initializing  fourth element with 82 ---*/
		number[3]=82;
		/*---initializing  fifth element with 95 ---*/
		number[4]=95;
		/*---initializing  sixth element with 16 ---*/
		number[5]=16;
		/*---initializing  first element with 74 ---*/
		number[6]=74;
		/*---initializing  first element with 83 ---*/
		number[7]=83;
		/*---initializing  first element with 121 ---*/
		number[8]=121;
		/*---initializing  first element with 45 ---*/
		number[9]=173;
		
//		to print array elements for loops
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+",");
			
		}
		
		

	}

}

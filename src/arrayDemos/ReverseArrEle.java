package arrayDemos;

public class ReverseArrEle {

	
	public static void main(String[] args) {
		// WAP to function to reverse an array
		int x=1;
		int[] intialArr = new int[5];
		for(int i=0; i<intialArr.length; i++) {
			
			intialArr[i]=x;
			x++;
			System.out.print(intialArr[i]+",");
		}
		

	}

}

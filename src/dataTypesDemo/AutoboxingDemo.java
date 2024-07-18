package dataTypesDemo;

public class AutoboxingDemo {

	public static void main(String[] args) {
		byte byteExample=10;
		Byte byteDemo=byteExample;//Autoboxing
		short shortExample=25;
		Short shortDemo=shortExample;
		int intExample=6456789;
		Integer intDemo=intExample;
		long longExample=7890231234567l;
		Long longDemo= longExample;
		float floatExample=12.5f;
		Float floatDemo=floatExample;
		double doubleExample=13.4567890d;
		Double doubleDemo=doubleExample;
		boolean booleanExample=true;
		Boolean booleanDemo= booleanExample;
		char charExample='a';
		Character charDemo =charExample;
		
		System.out.println(byteExample);
		System.out.println(byteDemo+" Autoboxing");
		System.out.println(shortExample);
		System.out.println(shortDemo+" Autoboxing");
		System.out.println(intExample);
		System.out.println(intDemo+" Autoboxing");
		System.out.println(longExample);
		System.out.println(longDemo+" Autoboxing");
		System.out.println(floatExample);
		System.out.println(floatDemo+" Autoboxing");
		System.out.println(doubleExample);
		System.out.println(doubleDemo+" Autoboxing");
		System.out.println(booleanExample);
		System.out.println(booleanDemo+" Autoboxing");
		System.out.println(charExample);
		System.out.println(charDemo+" Autoboxing");


	}

}

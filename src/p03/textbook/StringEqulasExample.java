package p03.textbook;

public class StringEqulasExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1);
		System.out.println(strVar2);
		System.out.println(strVar3);
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		System.out.println( strVar1.equals(strVar3));
		
		
	}

}

package p13.textbook.s130501;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		
		// String은 Number 타입이 아님 
//		String str = Util.compare("a", "b");
		
		// int --> Integer (auto boxing)
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		// double --> Double (auto Unboxing)
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
}

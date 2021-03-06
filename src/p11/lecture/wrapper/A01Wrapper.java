package p11.lecture.wrapper;

public class A01Wrapper {
	public static void main(String[] args) {
		// 기본 타입 : 8개
		// 나머지는 모두 참조 타입 (reference type)
		
		// Wrapper class들
		// Byte, Short, Integer, Long
		// Character, Boolean
		// Float, Double
		
		Integer i1 = new Integer(100);
		System.out.println(i1.hashCode());
		System.out.println(System.identityHashCode(i1));
		
		Object[] arr1 = new Object[] {"java", 3, true, 3.14, 'a'};
		
		Object o1 = new Integer(3); // Boxing
		Object o2 = 3; // Auto Boxing
		
//		int intVar1 = o1; --> error
		
		Integer i2 = new Integer(99);
		int intVar2 = i2; // Auto UnBoxing
		
		intVar2 = i2.intValue(); // Boxing
		
		
		
		
	}
}

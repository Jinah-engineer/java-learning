package p02.lecture;

public class A11TypeConversion {
	public static void main(String[] args) {
		// 정수: byte, short, int, long
		
		
		// 자동 형변환
		byte byteVar1 = 100;
		short shortVar1 = byteVar1; // 작은 타입을 큰 타입에 넣는 것은 문제가 없다.
		int intVar1 = shortVar1;
		intVar1 = byteVar1;
		
		long longVar1 = intVar1;
		longVar1 = shortVar1;
		longVar1 = byteVar1;
		
		//////////////////////////
		int intVar2 = 100;
		short shortVar2 = 100;
//		shortVar2 = intVar2; --> compile error
		
		
		// 강제 형변환 (type casting -> casting) 
		shortVar2 = (short) intVar2; 
		// 만약 invar2의 값이 200000000이라면 값이 자동으로 변경될 수 있다. 우리가 원하는 값을 얻지 못할 가능성 있움
	}
}

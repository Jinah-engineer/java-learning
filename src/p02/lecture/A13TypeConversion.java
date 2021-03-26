package p02.lecture;

public class A13TypeConversion {
	public static void main(String[] args) {
		// int: 4byte (32bit) - 정수 저장
		// float: 4byte (32bit) - 실수 저장
		
		// float 저장법
		// 부호비트 1개 + 지수비트 8개 + 가수비트 23개 (가수의 지수제곱(승) - A X 2의 N승)
		// 0000 0000 0000 0000 0000 0000 0000 0000
		
		int intVar1 = 66977791;
		float floatVar1 = intVar1;
		
		System.out.println(floatVar1);
		
		// double 저장법 (8byte)
		// 부호비트 1
		// 지수비트 11
		// 가수비트 52
		
		double doubleVar1 = intVar1;
		System.out.println(doubleVar1); // double 값이 좀 더 정확하다. 
		
	}
}

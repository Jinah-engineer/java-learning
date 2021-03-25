package p02.lecture;

public class A05TypeInt {
	public static void main(String[] args) {
		// int : 4byte (32bit)
		
		// 십진법 0 : 0000 0000 0000 0000 0000 0000 0000 0000 
		// 십진법 1 : 0000 0000 0000 0000 0000 0000 0000 0001
		// 십진법 2 : 0000 0000 0000 0000 0000 0000 0000 0010
		// .
		// .
		// .
		// 십진법 2147483647 : 0111 1111 1111 1111 1111 1111 1111 1111
		// 위에 1을 더하면
		// 십진법 -2147483648 : 1000 0000 0000 0000 0000 0000 0000 0000
//						-1   : 1111 1111 1111 1111 1111 1111 1111 1111
		
		int intVar; 
		intVar = 0;
		intVar = 2147483647; // max
//		intVar = 2147483648; --> error
		intVar = -2147483648; // min
//		intVar = -2147483648; --> error
		
		// 16진법 	   0 ~ F
		//  2진법 : 0000 ~ 1111
		// 10진법 :    0 ~ 15  (총 16개의 숫자)
		
		// CSS color : rgb (255, 255, 255_
		// 			 : 255 --> (2진법) --> 1111 1111 = #FFFFFF
		
		intVar = 255;
		System.out.println(intVar);
		intVar = 0xFF; // = 250
		System.out.println(intVar);
		// 10진법을 16진법으로 표현하기도 한다. 
		intVar = 0377; // 8진법
		System.out.println(intVar);
	}
}

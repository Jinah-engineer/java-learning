package p02.textbook.exercise;

public class Solution01 {
	public static void main(String[] args) {
		// 1번 문제: 4번 - 변수는 초기값이 저장되지 않는 상태에서 읽을 수 "없다"
		int v;
		
//		System.out.println(v); // compile error
		
		// 2번 문제: 
		int modelName; //LowerCamelCase
//		int class; --> 자바에서 사용하는 예약어는 사용불가! 
//		int 6hour; --> 숫자로 시작 불가
		int $value;
		int _age;
//		int int; --> 예약어 사용불가
		
		// 3번 문제:
		// 크기/타입 	1byte 	2byte			4byte	8byte
		// 	  정수		byte	short,char		int		long
		// 	  실수								float	double
		// 	  논리 --- boolean
		
		// 4번 문제:
		int age;
		age = 10;
		double price = 3.14;
		
		// 타입: int, double
		// 변수명: age, price
		// 리터럴: 10, 3.14
		
		// 5번 문제:
		byte byteValue = 10;
		char charValue = 'A';
		
		
		// 6번 문제: 4번
		int intValue = 10;
//		char charValue6 = "A";
		double doubleValue = 5.7;
		String strValue = "A";
		// 기본타입과 참조타입은 서로 상호변환시킬 수 없다. 
		
		double var6 = (double) intValue; // integer는 double로 자동 형 변환 가능하다. 굳이 double을 쓰지 않아도 됨. 
		
		
		// 7번 문제:
		int var1 = 10;
		long var2 = 100000000000L;
//		char var3 = ''; --> 문자가 꼭 들어가야 한다. 빈 문자는 불가
		double var4 = 10; // integer type을 넣을 수도 있다.
		float var5 = 10;  // integer type을 넣을 수도 있다.
		
		
		// 8번 문제: 1번
	byte byteValue8 = 10;
	float floatValue8 = 2.5F;
	double doubleValue8 = 2.5;
	
//	byte result1 = byteValue8 + byteValue8;
	int result2 = 5 + byteValue8;
	float result3 = 5 + floatValue8;
	double result4 = 5 + doubleValue8;
		
	}
}

package p02.lecture;

public class A14TypeConversion {
	public static void main(String[] args) {
		// 다른 타입끼리 연산시 큰 타입으로 자동형 변환
		int intVar1 = 33;
		int intVar2 = 44;
		
		int intVar3 = intVar1 + intVar2;
		
		long longVar1 = 55;
//		int intVar4 = intVar1 + longVar1; --> long type이 더 크기 때문에 error
		long longVar2 = intVar1 + longVar1;
		
		double doubleVar1 = 3.14;
//		int intVar5 = intVar1 + doubleVar1; --> error
		double	doubleVar2 = intVar1 + doubleVar1;
		
		//////////////////
		// 정수 연산이 조금 특별하다..!
		
		 byte b1 = 3;
		 byte b2 = 9;
//		 byte b3 = b1 + b2; //--> 정수 끼리의 연산은 항상 integer야 한다. 
		 int res = b1 + b2;
		 
		 
		 char c1 = 'a';
//		 char c2 = c1 + 1; --> error
		 
		 byte b4 = 3 + 1;
		 char c3 = 'a' + 1;
		 System.out.println(b4);
		 System.out.println(c3); 
		 
		 
		 
		 
 	}
}

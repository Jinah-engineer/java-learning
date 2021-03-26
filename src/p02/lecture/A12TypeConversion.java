package p02.lecture;

public class A12TypeConversion {
	public static void main(String[] args) {
		// 실수
		float floatVar1 = 3.14F;
		double doubleVar1;
		doubleVar1 = floatVar1;
		
		// 자동 형변환
		doubleVar1 = floatVar1;
		
		// 강제 형변환 (casting)
//		floatVar1 = doubleVar1; --> 불가 
		floatVar1 = (float) doubleVar1; // but 값을 잃어버릴 수 있다는 점을 감안해야 한다.
		
		/////////////////////
		
		// 정수 -> 실수 변환 가능할까? 가능함!
		int	intVar1 = 3;
		float floatVar2 = intVar1; // 자동 형변환
		double doubleVar2 = intVar1; // 자동 형변환
		
		// 실수 -> 정수? 가능 but 값을 잃어버릴 수 있다.
		double doubleVar3 = 3.14; 
//		int intVar3 = doubleVar3; --> error 
		int intVar3 = (int) doubleVar3; // 강제 형변환(casting)으로 가능
		System.out.println(intVar3); // 3
		
	}
}

package p02.lecture;

public class A06TypeLong {
	public static void main(String[] args) {
		// long : 8btye(64bit)
		// 0000...0000 64개..
		
		System.out.println("최대값");
		System.out.println(Long.MAX_VALUE); // 대문자 Long은 type 중 하나가 아님. 참조 타입임!
		System.out.println("최소값");
		System.out.println(Long.MIN_VALUE);
		
		long longVar;
//		longVar = 9223372036854775807; --> error (정수는 int 범위 안에서만 표현되는데 이건 범위를 초과!)
		longVar = 9223372036854775807L; // 뒤에 'L'을 붙여주면 long literal 값이 표현된다. 
//		longVar = 9223372036854775808L; // over
		
		longVar = -9223372036854775808L; // 최소값
//		longVar = -9223372036854775809L; // over
		
		longVar = 1_000_000; // = 1000000 
		longVar = 100_0000; // = 1000000 --> 이렇게 underbar를 추가하면 끊어볼 수 있다. 
		
	}
}

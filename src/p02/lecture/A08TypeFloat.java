package p02.lecture;

public class A08TypeFloat {
	public static void main(String[] args) {
		// float : 4byte (32bit) --> 실수를 저장!
		
		float var;
//		var = 3.14; --> 실수 literal은 double type이다! 8byte로 표현된 것을 4byte로 옮기려했기 때문에 error가 발생한 것
		var = 3.14F;
		
		// 양수 최대값
		System.out.println(Float.MAX_VALUE);
		
		// 양수 최소값
		System.out.println(Float.MIN_VALUE);
		
		
		
		// 음수 최대값
		System.out.println(-Float.MIN_VALUE);
		
		// 음수 최소값
		System.out.println(-Float.MAX_VALUE);
		
		
		// 양의 무한대
		System.out.println(Float.POSITIVE_INFINITY);
		// 음의 무한대
		System.out.println(Float.NEGATIVE_INFINITY);
		
		// NaN (Not a Number)
		System.out.println(Float.NaN);
		
		
		
	}
}

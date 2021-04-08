package p06.lecture.p6final;

public class A01Final {
		final static int f; // 초기화 할당 코드를 꼭 주어야 한다. 
		// final static int f = 55; 도 가능
		
		final static double PI = 3.1415; // 변하지 않는 값을 정의할 때 이를 사용한다. 관례적으로 대문자로 정의. 
		
		static {
			f = 55;
		}
	
		int a;
		final int b; // 꼭 초기화 값을 할당해주어야 한다. 
		
		A01Final() {
			this.b = 9;
		}
	
	public static void main(String[] args) {
		// final 변수(지역변수, 파라미터, 필드)
		// 값을 한번만 할당 받을 수 있다. 
		
		final int i;
		int j;
		j = 3;
		j = 5;
		
		i = 9;
//		i = 10; --> compile error
	}
	
	static void method1(final int i) {
		System.out.println(i);
//		i = 3; --> compile error
		
	}
}

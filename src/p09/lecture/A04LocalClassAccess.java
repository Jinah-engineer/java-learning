package p09.lecture;

public class A04LocalClassAccess {
	
	// local class - method 안에 있는 클래스
	void method(final int param) {
		final int localVar = 3; // local variable 사용 가능
//		localVar = 4; --> 값 변경 불가
//		final로 명시한 것만 쓸 수 있음 - final 선언을 하지 않아도 여전히 값을 수정할 수 없는 final의 특성을 갖는다.
		
		
		class LocalClass {
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}

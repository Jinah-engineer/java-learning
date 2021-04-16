package p09.lecture;

public class A02LocalClass {
	// non-static inner class 
	class InnerClass {

	}

	// static nested class
	static class NestedClass {

	}

	// local class
	void method1() {
		class LocalClass {
			// field
			// constructor
			// method 
		}
		
		// 이 method1에서만 사용가능한 클래스이다.
		LocalClass o1 = new LocalClass();
	}
}

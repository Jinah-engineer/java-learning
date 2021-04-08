package p06.lecture.p5static;

public class MyClass2 {
	// class field ( = static fie
	static int i;
	
	// instance field
	int j;
	
	// class method ( = static method) - 객체를 생성하지 않고 사용할 수 있는 메소드
	static void method() {
		System.out.println("method()");
	}
	
	// instance method 
	void method1() {
		System.out.println("method1()");
	}
}

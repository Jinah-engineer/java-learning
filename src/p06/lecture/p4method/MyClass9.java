package p06.lecture.p4method;

public class MyClass9 {
	// 메소드 오버로딩 : 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것
	// 리턴타입은 메소드 오버로딩과 관련이 없다. 
	void method() { // parameter : 0개
		System.out.println("method() 메소드");
	}
	
	void method(int i) { 
		System.out.println("method(int)");
	}
	
	void method(double i) {
		System.out.println("method(double)");
	}
	
	void method(int i, int j) {
		System.out.println("method(int, int)");
	}
	
	void method(int i, String s) {
		System.out.println("method(int, String)");
	}
	
	void method(String s, int i) {
		System.out.println("method(Sting, int)");
	}
}

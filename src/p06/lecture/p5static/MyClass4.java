package p06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int j;
	
	static int a = 30;
	static int b;
	
	static {
		// 값을 초기화하는 코드 작성 
		b = 50;
		System.out.println("static block"); // JVM이 클래스 블록을 읽기 시작할때 실행된다.
	}
	
	static {
		System.out.println("static block2");
	}
	
	MyClass4() {
		// instance field를 초기화하는 constructor
		this.j = 5;
	}
}

package p06.lecture.p5static;

public class MyClass3 {
	// field
	int i;
	static int j;
	
	// static method
	static void method1() {
		System.out.println("method1()");
//		method4(); --> compile error
		System.out.println(j);
//		System.out.println(i); --> compile error 어느 instance 인지 특정지을 수 없기 때문에 불가하다.
	}
	
	static void method3() {
		System.out.println("method3()");
	}
	
	// instance method
	void method2() {
		System.out.println("method2()");
		this.method4(); // this는 instance method에서만 사용이 가능하다. static 불가. 
		
		// instance member는 static member에 접근 가능
		method3(); // static method는 instance method에서 호출이 가능하다. 
	}
	
	void method4() {
		System.out.println("method4()");
	}
}

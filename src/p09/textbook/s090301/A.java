package p09.textbook.s090301;

public class A {
	// instance field
	B field1 = new B();
	C field2 = new C();
	
	
	// instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// static field initialization 정적 필드 초기화
//	static field B field3 = new B();
	static C field4 = new C();
	
	// static method
	static void method2() {
//		B var1 = new B();
		C var2 = new C();
	}
	
	// instance member class
	class B {
		
	}
	
	// static member class
	static class C {
		
	}
}

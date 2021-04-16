package p09.lecture;

public class A01NestedClassExample {
	public static void main(String[] args) {
		
		A01NestedClass.StaticClass static1 = new A01NestedClass.StaticClass(); // static은 바로 호출 가능 (class member)
		
//		A01NestedClass.InnerClass inner1 = new A01NestedClass.InnerClass(); --> compile error 
		A01NestedClass outer1 = new A01NestedClass();
		A01NestedClass.InnerClass inner2 = outer1.new InnerClass();
		
		
	}
}

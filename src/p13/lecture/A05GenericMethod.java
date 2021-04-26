package p13.lecture;

public class A05GenericMethod {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.<String>method1(); // but 흔치 않은 코드
		o1.<String>method2("java");
		o1.method2("Spring"); // <type> 생략가능. jvm이 추론하기 때문
		o1.<String>method3();
	}
}

class MyClass5 {
	// Generic Method
	public <T> void method1() {}
	public <T> void method2(T param) {}
	public <T> T method3() {
		return null;
	}
	

}

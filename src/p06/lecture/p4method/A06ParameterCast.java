package p06.lecture.p4method;

public class A06ParameterCast {
	public static void main(String[] args) {
		int a = 5;
		double b;
		b = a;
		
		MyClass6 o1 = new MyClass6();
		o1.method1(a);
//		o1.method1(b); --> compile error double 타입은 int로 자동형변환이 되지 않기 때문이다
		
		o1.method2(b);
		o1.method2(a); // int로 자동 형변환 된다. 
		
		
		
	}
}

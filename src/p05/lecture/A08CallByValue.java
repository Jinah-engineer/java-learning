package p05.lecture;

public class A08CallByValue {

	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		
		System.out.println("-----------메소드1-------------");
		method1(i); // method 호출
		method1(j);
		
		String s = "java";
		String u = new String("java");
		System.out.println(System.identityHashCode(s));
		System.out.println("-----------메소드2-------------");
		method2(s);
		System.out.println(System.identityHashCode(u));
		method2(u);
		
	}
	
	public static void method1(int a) {
		System.out.println(a);
	}
	
	public static void method2(String s) {
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
}

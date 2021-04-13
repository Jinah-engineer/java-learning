package p06.lecture.p8access_modifier.package1;

public class A03AccessModifierExample {
	public static void main(String[] args) {
		
		MyClass01 o1= new MyClass01();
		
		System.out.println(o1.i);
//		System.out.println(o1.j); // private (자기 자신만 사용 가능)
		System.out.println(o1.k); // package private, default
		
	}
}

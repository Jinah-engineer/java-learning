package p06.lecture.p8access_modifier;

import p06.lecture.p8access_modifier.package1.MyClass01;

public class A02AccessModifierExample {
	public static void main(String[] args) {
		
		MyClass01 o1 = new MyClass01();
		
//		System.out.println(o1.j); --> not visible (private)
		System.out.println(o1.i); // public은 접근 가능
//		System.out.println(o1.k); --> not visible (default, package private)
		
	}
}

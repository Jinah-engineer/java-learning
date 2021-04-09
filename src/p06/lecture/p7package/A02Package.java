package p06.lecture.p7package;

import p06.lecture.p7package.package1.MyClass1;
import p06.lecture.p7package.package2.MyClass2;

public class A02Package {
	public static void main(String[] args) {
//		p06.lecture.p7package.package1.MyClass1 o1 
//		= new p06.lecture.p7package.package1.MyClass1(); // 하위 패키지에 있기 때문에 패키지명을 넣어야 한다.
		
		MyClass1 o1 = new MyClass1(); // ctrl + shift + o
		
		MyClass2 o2 = new MyClass2();
		
		MyClass3 p3 = new MyClass3(); // 패키지명 없이 사용가능
	}
}

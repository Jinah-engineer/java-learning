package p06.lecture.p5static;

public class A02StaticMember {
	public static void main(String[] args) {
		
		MyClass2.i = 5;
		System.out.println(MyClass2.i);
		
		MyClass2.method();
		
//		MyClass2.j = 3; --> instance 없이 사용불가
//		MyClass2.method(); --> 이하 동일
		
		MyClass2 o1 = new MyClass2();
		o1.j = 10;
		
		MyClass2 o2 = new MyClass2();
		o2.j = 20;
		
		System.out.println(o1.j);
		System.out.println(o2.j);
		
		System.out.println(o1.i); // 같은 instance 참조
		System.out.println(o2.i); // 이하 동일
		
		o1.i = 9;
		
		System.out.println(o1.i); // 같은 instance 참조
		System.out.println(o2.i);
		System.out.println(MyClass2.i);
		
		
	}
}

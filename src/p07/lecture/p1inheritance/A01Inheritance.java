package p07.lecture.p1inheritance;

public class A01Inheritance {
	// 상속 : 상속 받는 클래스(자식 클래스)는 상속하는 클래스(부모 클래스)의 멤버를 갖는다. ㅜ
	 
	// 상속받는 클래스: 하위 클래스 = 자식 클래스 = sub class
	// 상속하는 클래스: 상위 클래스 = 부모 클래스 = super class 
	
	// 문법 : 서브클래스 extends 수퍼 클래스
	// class subClass extends superClasss { field constructor method here}

	// 서브클래스는 여러 수퍼클래스를 가질 수는 없다.
	// 하지만 하나의 수퍼 클래스가 여러 클래스에게 상속할 수는 있다. 
	// 자식 -> 부모 선택 가능 but 하나의 부모만 선택 가능
	
	public static void main(String[] args) {
		A01Child o1 = new A01Child();
//		A01Child o2 = new A01Child(3); --> 필드와 메소드만 상속이 가능하다. 
		
		o1.i = 3;
		o1.method1();
	}
}

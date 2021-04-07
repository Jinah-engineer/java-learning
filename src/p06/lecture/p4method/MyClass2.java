package p06.lecture.p4method;

public class MyClass2 {
	int a; 
	
	void method1(int b) { 
		int c = 99;
		int a = 10000;
		System.out.println("a : " + a); // field 'a'는 자동으로 초기값이 주어진다. 
		System.out.println("this.a : " + this.a);
		System.out.println("b : " + b); // b는 메소드가 호출될때 값이 결정된다
		System.out.println("c : " + c); // method안에 있는 변수는 초기화하지 않으면 사용할 수 없다.
	}
}

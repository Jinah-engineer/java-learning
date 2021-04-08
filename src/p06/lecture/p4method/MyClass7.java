package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i) {
		System.out.println("method1");
	}
	
	void method2(int i, int j) {
		System.out.println("method2");
	}
	
	//varargs
	void method3(int...i) {  // integer를 여러 개 받겠다는 의미
		System.out.println("method3");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	
	void method4(double d, int...i) { // parameter가 0개 이상이라는 의미, 따라서 다른 parameter와 같이 쓰게 된다면 항상 맨 뒤에 있어야 한다.
		System.out.println("method4");
	}
}

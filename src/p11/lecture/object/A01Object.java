package p11.lecture.object;

public class A01Object {
	// Object 클래스는 모든 클래스의 상위 클래스이다. 
	
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		int i = o1.hashCode();
		String s = o1.toString();
	}
	
}

class MyClass extends Object{ // object extends 를 적지 않아도 같은 상태를 표현한다. 
	
}
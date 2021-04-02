package p05.lecture;

public class A13CallyByValue {

	public static void main(String[] args) { // main method
		System.out.println("main statement1");
		
		method1(); // method 호출 
		
		method1();
		
		System.out.println("main statement2");
		
		method1();
		
		method2(5); // int parameter를 명시했기 때문에 int 값을 넣어줘야 한다.
		
		method2(10);
	}
	
	public static void method1() { // method1 method
		System.out.println("method1 statement1");
		System.out.println("method2 statement2");
	}
	
	public static void method2(int i) {
		System.out.println("method2 statement1");
		System.out.println(i);
		System.out.println("method2 statement2");
	}

}

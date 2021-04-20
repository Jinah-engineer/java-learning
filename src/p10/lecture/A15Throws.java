package p10.lecture;

public class A15Throws {
	public static void main(String[] args) {
		System.out.println("프로그램 실행!");
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료!");
	}
	
	// method
	public static void method1() throws ClassNotFoundException {
		method2();
	}
	
	public static void method2() throws ClassNotFoundException {
		method3();
	}
	
	public static void method3() throws ClassNotFoundException {
		/*
		try {
			Class.forName("java.leng.Number2"); // general exception
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // error 내용 출력
		}
		*/
		Class.forName("java.lang.Number2");
		
	}
}

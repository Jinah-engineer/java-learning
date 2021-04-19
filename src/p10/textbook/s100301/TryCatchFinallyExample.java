package p10.textbook.s100301;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		
		try {
			System.out.println("try block start");
			
			Class clazz = Class.forName("java.lang.String2");
			
			System.out.println("try block finished");
			
		} catch (ClassNotFoundException e) {
			System.out.println("catch block start");
			
			System.out.println("클래스가 존재하지 않습니다.");
			
			System.out.println("catch block finished");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}

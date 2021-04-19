package p10.lecture;

public class A09TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		
		try {
			System.out.println("try block start-!");
			int[] arr1 = {2, 3, 4};
			System.out.println(arr1[3]);
			System.out.println("try block finished :-)");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch block start-!");
			System.out.println(e.getMessage());
			System.out.println("catch block finished :-)");
			
		} finally { // 무조건 실행되어야 하는 코드는 finally block 안에
			System.out.println("always run finally block ^0^ ");
		}
		System.out.println("프로그램 종료");
	}
}

package p10.lecture;

public class A08TryCatch {
	public static void main(String[] args) {
		
		System.out.println("프로그램 실행 중입니다 ~ ^_^");
		
		try {
			System.out.println("try block start ~");
			int[] arr1 = {5, 6, 7};
			System.out.println(arr1[3]);
			
			System.out.println("try block finished :-)");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch block start ~");
			
			System.out.println(e.getMessage());
			
			System.out.println("catch block finished 0_^");
		}
		
		
		System.out.println("프로그램이 종료되었습니다 0_0");
	}
}

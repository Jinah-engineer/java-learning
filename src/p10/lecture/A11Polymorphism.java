package p10.lecture;

public class A11Polymorphism {
	public static void main(String[] args) {
		
		System.out.println("프로그램 start >_<");
		
		try {
			System.out.println("try block start-!");
			
			int[] arr1 = {};
			System.out.println(arr1[0]); // ArrayIndexOutOfBoundsException
			Integer.parseInt("abc"); // NumberFormatException
			String str = "java";
			Object o = str;
			StringBuffer sb = (StringBuffer) o; // ClassCastException
			
			
			System.out.println("try block finished :)");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 오류");
			
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
			
		} catch (ClassCastException e) {
			System.out.println("클래스 캐스팅 오류");
			
		} catch (Exception e) { // Exception만을 사용해서 다형성을 이용해도 좋다. 하지만 항상 마지막 순서에 있도록 해야 한다.
			System.out.println("Exception 발생!");
		} 
		
		
		System.out.println("프로그램 종료합니다 ^_^");
	}
}

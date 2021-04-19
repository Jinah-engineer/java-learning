package p10.lecture;

public class A02NullPointerException {
	public static void main(String[] args) {
		
		// NullPointerException - Unchecked Exception
		System.out.println("프로그램 실행 중입니다~ ^_^");
		
		String str = "java";
		showLength(str);
		
		str = null;
		showLength(str);
		
		
		System.out.println("프로그램 종료되었습니다.");
	}
	
	private static void showLength(String s) {
		System.out.println("문자열의 길이를 확인하세요! : " + s.length() + "글자입니다");
	}
}

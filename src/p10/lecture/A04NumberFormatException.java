package p10.lecture;

public class A04NumberFormatException {
	public static void main(String[] args) {
		System.out.println("프로그램 실행 중입니다 ~ ^_^");
		
		String str1 = "100a";
		
		int int1 = Integer.parseInt(str1);
		System.out.println(int1);
		
		int result = int1 * 2;
		System.out.println(result);
		
		System.out.println("프로그램이 종료되었습니다 0_0");
	}
}

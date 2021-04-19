package p10.lecture;

public class A05ClassCastException {
	public static void main(String[] args) {
		System.out.println("프로그램을 실행합니다~ ^_^");
		
		String str1 = "java";
		Object o1 = str1; // String은 Object를 상속받기 때문에 (API 확인)
		
		String str2 = (String) o1;
//		StringBuffer sb1 = (StringBuffer) o1; // String은 StringBuffer를 상속받지 않기 때문에 예외가 발생
		
		System.out.println("프로그램이 종료되었습니다. 0_0");
		
		
	}
}

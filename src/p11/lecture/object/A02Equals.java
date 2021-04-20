package p11.lecture.object;

public class A02Equals {
	public static void main(String[] args) {
		
		// equals() --> 두 객체가 동일한 객체라면 true를 리턴
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
		
		// String 객체의 equals() method는 String 객체의 번지를 비교하는 것이 아니라, 문자열이 동일한 지 조사한다
		// String 클래스가 Object의 equals() 메소드를 재정의(오버라이딩)해서 번지 비교가 아닌 문자열 비교로 변경했기 때문이다. 
		String str1 = new String("java");
		String str2 = "java";
		
	}
}

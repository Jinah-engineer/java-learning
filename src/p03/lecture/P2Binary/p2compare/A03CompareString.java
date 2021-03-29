package p03.lecture.P2Binary.p2compare;

public class A03CompareString {

	public static void main(String[] args) {
		
		// String 간 크기 비교 불가
		String a = "abc";
		String b = "def";
		
//		System.out.println(a < b); --> compile error 
		
		String c = "a";
		String d = "b";
		
//		System.out.println(c < d); --> compile error
		
		char e = 'a';
		char f = 'b';
		System.out.println(e < f);
		
		// 동등한 가 (==) e 동등하지 않다(!=)
		String str1 = "java";
		String str2 = "java";
		
		System.out.println(str1 == str2);
		
		String str3 = "ja";
		String str4 = "va";
		
		String str5 = str3 + str4;
		System.out.println(str1);
		System.out.println(str5);
		
		System.out.println(str1 == str5); // 참조값이 같은 지를 비교하기 때문이다.
		
		// 문자열이 같은 지 확인하는 메소드
		// equals 
		
		System.out.println(str1.equals(str5));
		
	}

}

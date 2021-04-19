package p02.lecture;

public class A07TypeChar {
	public static void main(String[] args) {
		// char : 2byte (8bit) 문자 저장
		 
		// javascript
		// var a = "a";
		// 	   a = "가";
		
		
		// java 문자열
		// 큰 따옴표 String literal
		String s1 = "hello"; // 2개 이상의 문자열을 쓰고 싶다면 string type을 사용해야 한다.
		s1 = "자바";
		s1 = "자";
		s1 = "a";
		s1 = "";
		
		// java 문자 - 하나의 문자를 저장할 수 있다
		char charVar; 
//		charVar = "a"; --> 큰 따옴표 사용 불가 error
		charVar = 'a'; // char literal
		// 실제로 'a'라는 코드는 어떤 값을 가지고 있을까? 
		// unicode! (home.unicode.org)
		charVar = '눈';
		System.out.println(charVar);
		charVar = '\uB208';
		System.out.println(charVar);
		charVar = 45576; // 10진법 -> 정수 타입
		System.out.println(charVar);
		
//		charVar = ''; --> error 빈 문자 코드를 넣을 수 없다
		charVar = '\u10E6';
		System.out.println(charVar);
		
		int unicode = charVar;
		System.out.println(unicode);
		
	}
}

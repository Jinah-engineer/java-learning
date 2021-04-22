package p11.lecture.regularexpression;

import java.util.regex.Pattern;

public class A01RegularExpression {
	// 정규 표현식
	// 문자열의 패턴을 표현하는 문자열
	// meta-character, quantifier

	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";

		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);

		regex1 = "java";
		str1 = "java";

		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d";
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d";
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d\\d";
		str1 = "67";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3}";
		str1 = "943";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3,}";
		str1 = "943121212";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-9876-3333";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d{3,5}"; //3~5개의 문자
		str1 = "222345";
		/*
		str1 = "22345";
		str1 = "2345";
		str1 = "345";
		str1 = "45";
		*/
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d+"; // 1개 이상
		str1 = "1";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d*"; // 0개 이상
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\d?"; // 1개 == \d{0,1}
		str1 = "1";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "010-?\\d{4}-?\\d{4}";
		str1 = "010-9876-3333";
		String str2 = "01098763333";
		String str3 = "010-98763333";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "\\w"; 
		str1 = "s";
		str2 = "T";
		str3 = "8";
		String str4 = "_";
		String str5 = " ";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "\\w\\d+";
		str1 = "e3498769734";
		str2 = "2938792752";
		str3 = "_3987259";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java)";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "(java)+";
		str1 = "javajavajava";
		str2 = "javajavajavaj";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		
		
		regex1 = "(java|python)";
		str1 = "java";
		str2 = "python";
		str3 = "spring";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "(java|python)+";
		str1 = "java";
		str2 = "python";
		str3 = "pythonjavajavapython";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		
		regex1 = "."; // 모든 문자 중 한개의 문자가 가능
		str1 = "$";
		str2 = ".";
		str3 = "A";
		str4 = "9";
		str5 = "_";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "[abc]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str3 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));

		regex1 = "[^abc]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		
		regex1 = "[a-z]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		str5 = "A";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		
		regex1 = "[a-zA-Z]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		str5 = "A";
		String str6 = "7";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		System.out.println(Pattern.matches(regex1, str6));
		
		regex1 = "[가-힇]";
		str1 = "김";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\p{IsHangul}+";
		str1 = "ㅇㅋㅇㅋ";
		System.out.println(Pattern.matches(regex1, str1));
	}
}

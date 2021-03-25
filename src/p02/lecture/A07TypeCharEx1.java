package p02.lecture;

public class A07TypeCharEx1 {
	public static void main(String[] args) {
		String str = "lorem, ipsum";
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if ((0x61 <= c && c <= 0x7a) || (0x41 <= c && c <= 0x5a)) {
				count++;
			}
			
//			위에 식을 10진법으로 하면
//			if ((97 <= c && c <= 122) || (65 <= c && c <= 90)) {
//				count++;
//			}
			
//			문자 자체로 표현하고 싶다면
//			if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
//				count++;
//			}
		}
		System.out.println(count);
	}
}

	

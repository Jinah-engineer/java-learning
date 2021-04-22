package p11.textbook.s110701;

public class ByteToStringExample {
	public static void main(String[] args) {
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		// 배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성 
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		
	}
}

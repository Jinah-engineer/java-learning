package p18.lecture;

import java.io.FileInputStream;
import java.io.InputStream;

public class A03InputStream {
	public static void main(String[] args) throws Exception{
		
		String fileName = "src/p18/lecture/A02InputStream.java";
		
		InputStream is = new FileInputStream(fileName);
		
		// read(byte[] b) method
		// 입력 스트림으로부터 매개값으로 주어진 바이트 배열의 길이만큼 바이트를 읽고 배열에 저장한다
		
		
		byte[] data = new byte[20];
		
//		int count = is.read(data);
//		
//		System.out.println(data[0]);
//		System.out.println(data[1]);
//		System.out.println(data[2]);
//		
//		System.out.println(count);
		
		int cnt = 0;
		while ((cnt = is.read(data)) != -1) {
			System.out.println(cnt);
		}
		
		
		is.close();
	}
}

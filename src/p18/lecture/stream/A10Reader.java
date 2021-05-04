package p18.lecture.stream;

import java.io.FileReader;
import java.io.Reader;

public class A10Reader {
	public static void main(String[] args) throws Exception {
		
		String file = "src/p18/lecture/A10Reader.java";
		Reader rd = new FileReader(file);
		
		char[] data = new char[10];
		
//		int len = rd.read(data);
//		
//		System.out.println(len);
//		System.out.println(data[0]);
//		System.out.println(data[9]);
//		
		int len = 0;
		
		while ((len = rd.read(data)) != -1) {
			System.out.println(len + "개 : " + new String(data, 0, len));
		}
		
		
		
		rd.close();
		
	}
}

package p18.lecture.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class A05OutputStream {
	public static void main(String[] args) throws Exception {
		
		String fileName = "src/p18/lecture/output2.txt";
		OutputStream os = new FileOutputStream(fileName);
		
		byte[] data = new byte[50];
		
		os.write(data);
		os.write(data);
		os.write(data, 0, 33); // params : byte[] 배열, index 시작 위치, 개수(길이)
		
		os.close();
	}
}

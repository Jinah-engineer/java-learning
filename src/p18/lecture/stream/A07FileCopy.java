package p18.lecture.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class A07FileCopy {
	public static void main(String[] args) throws Exception{
		
		String src = "src/p18/lecture/A02InputStream.java";
		String des = "src/p18/lecture/A02InputStream.copy2";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		byte[] data = new byte[20];
		int len = 0;
		while ((len = is.read(data)) != -1) {
			os.write(data, 0, len);
		}
		
		is.close();
		os.close();

		System.out.println("복사 완료");
	}
}

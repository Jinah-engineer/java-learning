package p18.lecture.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A27HandleException {
	public static void main(String[] args) {
		
		String path = "src/p18/lectrue/A27HandleException.java";
		FileInputStream fis = null;
		
		// try with resources - Autoclosable 구현
		try (
				FileInputStream is = new FileInputStream(path);
				FileOutputStream fos = new FileOutputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				) {
			
			fis.read();
			bis.read();
			fos.write('a');
			
		} catch (Exception e) {	e.printStackTrace(); }	
	}
}

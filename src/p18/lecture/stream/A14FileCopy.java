package p18.lecture.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class A14FileCopy {
	public static void main(String[] args) throws Exception{
		// 파일 복사 Reader, Writer 이용하기
		String src = "src/p18/lecture/A12FileCopy.java";
		String des = "src/p18/lecture/A12FileCopy.copy";
		
		Reader fr = new FileReader(src);
		Writer fw = new FileWriter(des);
		
		int c = 0;
		
		while((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		
		
		fr.close();
		fw.close();
		
		System.out.println("복사 완료");
		
	}
}

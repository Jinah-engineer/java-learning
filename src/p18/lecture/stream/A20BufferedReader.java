package p18.lecture.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class A20BufferedReader {
	public static void main(String[] args) throws Exception{
		
		// BufferedReader - 성능 향상 보조 스트림
		String path = "src/p18/lecture/A20BufferedReader.java";
		Reader rd = new FileReader(path);
		BufferedReader br = new BufferedReader(rd);
		
//		System.out.println((char) br.read()); 
//		System.out.println((char) br.read()); 
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		String line = null;
		
		while ( (line = br.readLine()) != null) {
			System.out.println(br.readLine());
		}
		
		br.close();
		rd.close();
		
		
		
	}
}

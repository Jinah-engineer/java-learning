package p18.textbook.exercise.ex7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		// 정확한 경로로 수정하세요.
		String filePath = "src/p18/textbook/exercise/ex7/AddLineNumberExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		int lineNum = 0;
		
		while ( (line = br.readLine()) != null ) {
			System.out.println(++lineNum + ": " + line);
		}
		
		
		br.close();
		fr.close();
	}
}

package p18.lecture;
// 안녕하세요 오늘 월요일이에요.
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A17FilterStream {
	public static void main(String[] args) throws Exception {
		// InputStream 을 Reader로 변환
		String file = "src/p18/lecture/A17FilterStream.java";
		InputStream is = getinputStream(file);
		InputStreamReader isr = new InputStreamReader(is);
		
		int b = 0;
		
		while ((b = isr.read()) != -1) {
			System.out.print((char) b);
		}
		
		isr.close();
		is.close();
	}
	
	public static InputStream getinputStream(String file) throws Exception {
		return new FileInputStream(file);
	}
}

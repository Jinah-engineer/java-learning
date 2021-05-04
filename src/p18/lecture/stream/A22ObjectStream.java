package p18.lecture.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class A22ObjectStream {
	public static void main(String[] args) throws Exception {
	
		// 객체 입출력 보조 스트림
		String path = "src/p18/lecture/output9.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new String("java")); // String 객체
		oos.writeObject(new String[] {"css", "html"}); // String Array
		
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		String s = (String) ois.readObject();
		String[] arr = (String[]) ois.readObject();
		System.out.println(s);
		System.out.println(arr[0]);
		
		fis.close();
		ois.close();
		
	}
}

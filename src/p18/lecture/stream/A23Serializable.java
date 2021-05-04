package p18.lecture.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A23Serializable {
	public static void main(String[] args) throws Exception {
		// 직렬화가 가능한 클래스 (Serializable)
		// 자바는 Serializable 인터페이스를 구현한 클래스만 직렬화할 수 있도록 제한
		// Serializable은 필드나 메소드가 없는 빈 interface
		// 객체를 직렬화할때 private 필드를 포함한 모든 필드를 바이트로 변환해도 좋다는 표시 역할
		
		String path = "src/p18/lecture/output10.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Car());
		
		oos.close();
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car c = (Car) ois.readObject();
		System.out.println(c);
		
		ois.close();
	}
}

class Car implements Serializable{
	private String name;
	private int id;
}
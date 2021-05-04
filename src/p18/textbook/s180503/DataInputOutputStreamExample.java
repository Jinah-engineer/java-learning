package p18.textbook.s180503;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		
		// 기본 타입 입출력 보조 스트림
		// 주의할 점 : 데이터 타입의 크긱가 모두 다르므로 DataOutputStrea으로 출력한 데이터를 다시 DataInputStream으로 읽어올 때는
		// 출력한 순서와 동일한 순서로 읽어야 한다
		// int -> boolean double (output) >>>> int -> boolean -> double (input)
		
		String path = "src/p18/textbook/primitive.dat";
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		DataInputStream dis = new DataInputStream(fis);
		
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		fis.close();
	}
}

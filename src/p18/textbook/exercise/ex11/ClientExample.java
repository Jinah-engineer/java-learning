package p18.textbook.exercise.ex11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/exercise/ex11/ClientExample.java";
		Socket socket = new Socket("172.30.1.59", 5001);
		OutputStream os = socket.getOutputStream();
		
		File file = new File(path);
		
		String fileName = file.getName();
		// code 1
		// 1. 클라이언트는 파일 이름이 저장된 길이 100바이트를 먼저 보냅니다.
		byte[] arr = new byte[100];
		fileName.getBytes(0, fileName.length(), arr, 0);
		os.write(arr, 0, 100);
		
		
		System.out.println("[파일 보내기 시작] " + fileName);
		// code 2 
		// 2. 이어서 파일 데이터를 보냅니다. 
		FileInputStream fis = new FileInputStream(file);
		
		int len = 0;
		while ( (len = fis.read(arr)) != -1 ) {
			os.write(arr, 0, len);
		}
		
		os.flush();
		
		System.out.println("[파일 보내기 완료]");
		
		os.close();
		socket.close();
	}
}

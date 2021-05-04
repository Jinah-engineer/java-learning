package p18.lecture.network;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class A02Socket {
	public static void main(String[] args) {
		// Socket
		// 네트워크 상에서 동작하는 프로그램 간 통신의 종착점 (endpoint)
		ServerSocket serverSocket = null;
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;

		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.59", 5001));

			System.out.println("[연결 기다림]");
			socket = serverSocket.accept();

			System.out.println("[연결 완료]");
			InetSocketAddress address = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println(address.getAddress());
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			osw.write("hello client");
			osw.flush();
		} 
		catch (Exception e) {e.printStackTrace();} 
		
		finally {
			if (os != null) {
				try {
					os.close();
				} catch (Exception e2) {}
			}
			
			if (osw != null) {
				try {
					osw.close();
				} catch (Exception e2) {}
			}
			
			try {
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e2) {}
			
			try {
				if (serverSocket != null) {
					serverSocket.close();
				}				
			} catch (Exception e2) {}
		}

	}
}

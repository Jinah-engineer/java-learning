package p12.textbook.s120203;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for (int i = 0; i < 20_0000_0000; i++) {}
		System.out.println(getName());
	}
}

package p12.lecture;

public class A10ThreadName {
	public static void main(String[] args) {
		
		Thread t1= new Thread(new Thread10());
		t1.setName("첫번째 스레드");
		t1.start();
		
		Thread t2 = new Thread(new Thread10(), "매개값으로 들어가는 스레드");
		t2.start();
	}
}

class Thread10 implements Runnable {
	
	@Override
	public void run() {
		Thread currenThread = Thread.currentThread();
		System.out.println(currenThread.getName());
	}
}

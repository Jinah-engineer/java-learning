package p12.lecture;

public class A14SynchronizedMethod {
	public static void main(String[] args) {
		
		Thread14 t1 = new Thread14();
		Thread14 t2 = new Thread14();
		
		Box box = new Box();
		t1.box = box;
		t2.box = box;
		
		t1.start();
		t2.start();
	}
}

// 스레드 14
class Thread14 extends Thread {
	public Box box;
	
	@Override
	public void run() {
		box.execute();
	}
}

// Box 클래스
class Box {
	public synchronized void execute() {
		System.out.println("method-start");
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		System.out.println("method-end");
	}
}

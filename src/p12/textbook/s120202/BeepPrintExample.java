package p12.textbook.s120202;

public class BeepPrintExample {
	// main thread
	public static void main(String[] args) {
		
		Thread thread = new BeepThread();
		thread.start(); //BeepThread
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			try {
				thread.sleep(500);
				
			} catch (InterruptedException e) {}
		}
	}
}

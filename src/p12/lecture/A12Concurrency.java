package p12.lecture;

public class A12Concurrency {
	
	static long shareValue = 0;
	
	public static void main(String[] args) {
		// Runnable 익명 구현 객체 
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					shareValue++;
				}
			}
		});
		
		t.start();
		
		// cpu를 나눠서 점유했기 때문에 엉터리값을 얻게 된다. 
		for (int i = 0; i < 100_0000; i++) {
			shareValue++;
		}
		
		try {	t.join();	} catch (InterruptedException e) {}
		
		
		System.out.println(shareValue);
	}
}

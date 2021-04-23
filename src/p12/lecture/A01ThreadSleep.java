package p12.lecture;

public class A01ThreadSleep {
	public static void main(String[] args) {
		
		System.out.println("실행 1번");
		
		try {
			Thread.sleep(5000); // 5초 멈춤 
		} catch (InterruptedException e) {} // 1000 = 1초
		
		System.out.println("실행 2번");
	}
}

package p12.textbook.s120203;

public class ThreadNameExample {
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		// ThreadA 생성
		ThreadA threadA = new ThreadA();
		// 스레드 이름 얻기
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		
		// ThreadB 생성
		ThreadB threadB = new ThreadB();
		// 스레드 이름 얻기
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.start();
	}
}

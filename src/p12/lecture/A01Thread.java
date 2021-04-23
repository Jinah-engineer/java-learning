package p12.lecture;

public class A01Thread {
	// Thread : 프로그램(프로세스) 내에서 실행되는 흐름의 단위
	
	// How to make Thread?
	// 1. Thread Class 상속
	// 2. Runnable interface 구현
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.start(); // Thread1 객체의 run() 메소드를 실행시킨다. 
		
		System.out.println("메인 메소드 실행");
	}
	
}

class Thread1 extends Thread {
	
	
	// run method overriding
	@Override
	public void run() {
		System.out.println("Thread1 실행");
	}
}
package p12.textbook.s120401;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calulator = new Calculator();

		// User1 스레드 생성
		User1 user1 = new User1();
		// 공유 객체 설정
		user1.setCalculator(calulator);
		// User1 스레드 시작
		user1.start();

		// User2 스레드 생성
		User2 user2 = new User2();
		// 공유 객체 설정
		user2.setCalculator(calulator);
		// User2 스레드 시작
		user2.start();

	}
}

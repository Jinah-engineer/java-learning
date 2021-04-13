package p07.textbook.s070702;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // car 객체 생성
		
		for (int i = 0; i <= 5; i++) {
			int problemLocation = car.run(); // car 객체의 run 메소드 5번 반복 실행
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			// 1회전 시 출력되는 내용을 구분
			System.out.println("----------------------------------"); 
		}
	}
}

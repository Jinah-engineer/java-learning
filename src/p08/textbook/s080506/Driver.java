package p08.textbook.s080506;

public class Driver {
	public void drive(Vehicle vehicle) { // vehicle에는 bus와 taxi 객체
		if (vehicle instanceof Bus) { // vehicle 매개 변수가 참조하는 객체가 bus인지 조사
			Bus bus = (Bus) vehicle; // bus 객체일 경우 안전하게 강제 타입 변환을 시킨다. 
			bus.checkFare();
		}
		
		vehicle.run();
	}
}

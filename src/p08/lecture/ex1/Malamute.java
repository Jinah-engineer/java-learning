package p08.lecture.ex1;

public class Malamute extends KindaDog implements Pet{

	@Override
	public void sit() {
		System.out.println("말라뮤트가 꼬리를 흔듭니다.");
	}
}

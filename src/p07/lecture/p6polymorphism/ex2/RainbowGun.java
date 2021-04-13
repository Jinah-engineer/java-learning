package p07.lecture.p6polymorphism.ex2;

public class RainbowGun extends Gun{
	@Override
	public void fire() {
		super.fire();
		System.out.println("레인보우 빔~");
	}
}

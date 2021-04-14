package p08.textbook.s080205;

public interface RemoteControl {
	// static final field
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// abstract method
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default method
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

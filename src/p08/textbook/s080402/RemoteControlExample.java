package p08.textbook.s080402;

import p08.textbook.s080205.RemoteControl;
import p08.textbook.s080301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null; // 참조하는 instance가 없다는 것을 명시적으로 표현
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
	}
}

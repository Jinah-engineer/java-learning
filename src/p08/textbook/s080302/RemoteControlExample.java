package p08.textbook.s080302;

import java.rmi.Remote;

import p08.textbook.s080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		
		System.out.println(rc.MAX_VOLUME);
		System.out.println(rc.MIN_VOLUME);
		rc.setMute(false);
		rc.turnOn();
		rc.turnOff();
		RemoteControl.changeBattery();
	}
}

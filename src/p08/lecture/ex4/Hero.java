package p08.lecture.ex4;

public class Hero {
	// field
	private Gun gun;
	
	// method
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		this.gun.fire();
	}
}

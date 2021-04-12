package p07.lecture.p4access_modifier_protected.package1;

public class NotChild {
	// method
	public void notChildMethod() {
		Parent p = new Parent();
		p.publicMethod();
		p.protectedMethod();
		p.defaultMethod();
//		p.privateMehod(); --> compile error
	}
}

package p13.lecture;

public class A06BoundedTypeParameter {
	public static void main(String[] args) {
		Generic6<String> g1 = new Generic6<>();
		Generic6<StringBuffer> g2 = new Generic6<>();
		Generic6<StringBuilder> g3 = new Generic6<>();
		
//		Generic6<Object> g4 = new Generic6<>(); --> error
		
		
		
	}
}

class Generic6<T extends CharSequence> {
	// CharSequence 인 T!! 
	private T field;
	
	public void method() {
		field.charAt(3); // polymorphism
	}
}

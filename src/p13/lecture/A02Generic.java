package p13.lecture;

public class A02Generic {
	public static void main(String[] args) {
		// Generic이 없던 시절?! 
		Generic2 g2 = new Generic2();
		g2.setO("java");
		String s = (String) g2.getO(); // getO()의 리턴타입은 Object type
		// 하지만 classCastException 발생 가능성 있음
		System.out.println(s);
		
		g2.setO(22); // auto boxing -> int --> integer
		Integer i = (Integer) g2.getO();
		
		g2.setO(3.14); // auto boxing (Double)
//		Integer d = (Integer) g2.getO(); // ClassCastException 발생
		
	}
}

class Generic2 {
	private Object o;
	
	public void setO(Object o) {
		this.o = o;
	}
	
	public Object getO() {
		return o;
	}
}
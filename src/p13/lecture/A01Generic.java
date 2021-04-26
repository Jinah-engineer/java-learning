package p13.lecture;

public class A01Generic {
	// generic type : 타입 파라미터를 가진 타입 
	// 타입이 결정되지 않은 것 
	// 타입 파라미터 명 작성 규칙 --> 관습적으로 대문자 1개 
	public static void main(String[] args) {
		GenericType1<Object> g1 = new GenericType1<Object>();
		GenericType1<String> g2 = new GenericType1<String>();
		GenericType1<Number> g3 = new GenericType1<>(); // 좌항에서 타입을 추론할 수 있으면, 오른쪽 타입 값은 생략 가능하다.
		
		
		
	}
	
}

class GenericType1<T> { 
	
}

interface GenericTypeInterface1<T, S, U> {
	
}
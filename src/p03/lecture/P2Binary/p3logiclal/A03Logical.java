package p03.lecture.P2Binary.p3logiclal;

public class A03Logical {

	public static void main(String[] args) {
		// and &&, & (논리곱)
		// or ||, | (논리합)
		// xor ^ (배타적 논리합)
		// not ! 
		
		// and &&, &
		// 연산의 결과 boolean
		// 양변기 모두 true일 때만 true, 나머지 모두 false
		
		System.out.println(true && true); // true
		System.out.println(true && false); // true
		System.out.println(false && true); // true
		System.out.println(false && false); // true
		
		System.out.println(true & true); // true
		System.out.println(true & false); // true
		System.out.println(false & true); // true
		System.out.println(false & false); // true
		
		// short circuit
		int i = 3;
		System.out.println(true && (i++) > 0); // true
		System.out.println(i);
		
		System.out.println(false && (i++) > 0); // false
		System.out.println(i);
		
		System.out.println(false & (i++) > 0); // false
		System.out.println(i);
		
		// or ||, |
		// 양변이 false 일 때만 false 
		// 나머지 모두 true
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false 
		
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false 
		
		// short circuit - 앞에가 false 일때 판단
		System.out.println(true || (i++) > 0); // true
		System.out.println(i);
		// 앞에가 true면 뒤에 볼 필요 없이 true
		
		System.out.println(false || (i++) > 0);
		System.out.println(i);
		// 앞에가 false 이기 때문에 뒤에 식을 평가한 후에 판단할 수 있다.
		
		System.out.println(true | (i++) > 0);
		// 두 피연산자를 모두 평가해서 산출 결과를 낸다
		
		// 코드를 읽는 순서 생각하기
		
		// xor ^ (exclusive or)
		// 두 항의 값이 다를 때만 true
		// 두 항의 값이 같으면 false
		System.out.println("xor");
		System.out.println(true ^ false); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false
		
		
	}

}

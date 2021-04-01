package p04.lecture;

public class A16While {

	public static void main(String[] args) {
		// 조건이 true이면 code block 실행 
		// 조건이 false이면 다음 실행 흐름으로 ~
		
		int a = 5;
		
		while (a > 0) {
			System.out.println("코드 블럭 내의 명령문 ... ");
			a--;
		}
		
		System.out.println("프로그램 종료");
	}

}

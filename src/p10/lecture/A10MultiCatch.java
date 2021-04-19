package p10.lecture;

public class A10MultiCatch {
	public static void main(String[] args) {
		
		try {
			
			String[] arr1 = {"300", "abc"};
			int i = Integer.parseInt(arr1[2]);
			
		} catch (NumberFormatException e) {
			System.out.println("수 형식이 바르지 않습니다.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 잘못 참조하였습니다.");
			
		} finally {
			System.out.println("항상 실행하는 코드입니다.");
		}
		
		System.out.println("프로그램 종료");
		
	}
}

package p10.lecture;

public class A19CustomException {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (IZeroException e) {
			
		}
		
	}

	private static void method1() throws IZeroException {
		int i = 0;
		
		if (i == 0) {
			throw new IZeroException("예외 메시지 출력 - i가 0입니다.");
		}
	}
	
	
}

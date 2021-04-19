package p10.textbook.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		String data = null;
		if (data != null) {
			System.out.println(data.toString());
		} else {
			System.out.println("예외가 발생 -_-;");
		}
	}
}

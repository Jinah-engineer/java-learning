package p10.lecture;

public class IZeroException extends Exception {
	public IZeroException() {}
	public IZeroException(String message) { // 예외 메시지를 갖는 생성자
		super(message); 
	}
}

package p99.codingbat;

public class WarmUp1Background {

	public static void main(String[] args) {
		
	}
	public String backAround(String str) {
		String last = str.substring(str.length() - 1);
		return last + str + last;
	}
}

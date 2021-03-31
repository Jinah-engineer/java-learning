package p99.programmers;

public class P12919 {
	public static void main(String[] args) {
		public String solution(String[] seoul) {
	        String answer = "";
	        
	        for (int i = 0; i < seoul.length; i++) {
	            String item = seoul[i];
	            if (item.equals("Kim")) {
	                return "김서방은 " + i + "에 있다";
	            }
	        }
	        
	        return answer;
	    }
	}
}

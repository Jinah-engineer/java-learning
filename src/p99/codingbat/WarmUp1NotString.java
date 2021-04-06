package p99.codingbat;

public class WarmUp1NotString {
	public static void main(String[] args) {
		// 1번
		/*
		public String notString(String str) {
			  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			    return str;
			  }
			  
			  return "not " + str;
			}
		*/
		
		// 2번 솔루션
			if (str.startsWith("not")) {
				return str;
			} else {
				return "not " + str;
			}
			
		
			// 3번 솔루션
			/*
			 * if (str.length() < 3) { return "not " + str; }
			 * 
			 * String front = str.substring(0, 3);
			 * 
			 * if (front.equals("not")) { return str; } else { return "not " + str; }
			 */
	}
}

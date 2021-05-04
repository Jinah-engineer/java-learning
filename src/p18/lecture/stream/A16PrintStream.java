package p18.lecture.stream;

import java.io.PrintStream;
import java.util.Scanner;

public class A16PrintStream {
	public static void main(String[] args) throws Exception {
		// PrintStream
		String file = "src/p18/lecture/output6.txt";
		Scanner scanner = new Scanner(System.in);
		
		PrintStream ps = new PrintStream(file);
		
		String line = "";
		
		while (!line.equals("종료")) {
			System.out.print("입력 >> ");
			line = scanner.nextLine();
			ps.println(line);
		}
		
		ps.close();
		scanner.close();
	}
}

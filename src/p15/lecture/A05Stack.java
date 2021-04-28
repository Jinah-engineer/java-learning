package p15.lecture;

import java.util.Stack;

public class A05Stack {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(3);
		stack.push(5);
		stack.push(6);
		
		System.out.println(stack);
		
		int last = stack.pop();
		System.out.println(last);
		
		System.out.println(stack);
		
		last = stack.pop();
		System.out.println(last);
		
		System.out.println(stack);
		
		last = stack.pop();
		System.out.println(last);
		
		System.out.println(stack);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		last = stack.peek(); // 꺼내지는 않고 마지막 값만 확인
		System.out.println(last);
		System.out.println(stack);
	}
}

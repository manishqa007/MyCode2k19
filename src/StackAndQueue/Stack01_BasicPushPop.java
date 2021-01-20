package StackAndQueue;

import java.util.Stack;

public class Stack01_BasicPushPop {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("first");
		stack.push("second");
		System.out.println(stack);
		stack.push("third");
		checkStack(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		checkStack(stack);
		stack.pop();
		checkStack(stack);
	}
	
	public static void checkStack(Stack<String> s) {
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is: "+s);
		}
	}
}

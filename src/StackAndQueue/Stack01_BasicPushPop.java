package StackAndQueue;

import java.util.Stack;

public class Stack01_BasicPushPop {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("first");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	
	public static void printStack(Stack<String> s) {
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is: "+s);
		}
	}
}

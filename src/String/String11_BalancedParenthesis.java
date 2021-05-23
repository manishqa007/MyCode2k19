package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class String11_BalancedParenthesis {

	public static void main(String[] args) {
		String str = "[()]{}{[()()]()}";
		boolean res = withoutStack(str); // Link: https://www.youtube.com/watch?v=mombpWRP0ho
		System.out.println("String balanced: " + res);
		boolean res2 = withStack(str);
		System.out.println("String balanced: " + res2);
	}
 
	private static boolean withoutStack(String str) {
		List<Character> list = new ArrayList<>();

		for (char c : str.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				list.add(0, c);
			} else {
				char ch = list.get(0);
				if (c == ')' && ch == '(' || c == ']' && ch == '[' || c == '}' && ch == '{') {
					list.remove(0);
				} else { // if some other symbol than bracket
					return false;
				}
			}
		}
		if (list.isEmpty())
			return true;
		else
			return false;
	}

	private static boolean withStack(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else {
				char ch = stack.peek();
				if (c == ')' && ch == '(' || c == ']' && ch == '[' || c == '}' && ch == '{') {
					stack.pop();
				}else {
					return false; 
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

}

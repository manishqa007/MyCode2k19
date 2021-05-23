package LinkList;
import java.util.Stack;

//Approach
//A simple solution is to use a stack of list nodes. This mainly involves three steps.
//Traverse the given list from head to tail and push every visited node to stack.
//Traverse the list again. For every visited node, pop a node from the stack and compare data of popped node with the currently visited node.
//If all nodes matched, then return true, else false.
public class Linklist13_CheckPalindromeInLinklist {
	static Node head;
	class Node {
		int data;
		Node next;

		Node(int d) {
			next = null;
			data = d;
		}
	}
	
	public void insertAtFront(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;	
	}

	public static void isPalindrome() {

		Node slow = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.data);
			slow = slow.next;
		}

		while (head != null) {
			
			int i = stack.pop();
			
			if (head.data == i) {
				ispalin = true;
			} else {
				ispalin = false;
				break;
			}
			head = head.next;
		}
		System.out.println("isPalidrome :" + ispalin);
	}
	
	/* Java program to check if linked list is palindrome recursively */
	public static void main(String args[]) {
		Linklist13_CheckPalindromeInLinklist list = new Linklist13_CheckPalindromeInLinklist();
//		list.insertAtFront(1);
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		list.insertAtFront(3);
		list.insertAtFront(2);
		list.insertAtFront(1);
		
		isPalindrome();
		
	}
}


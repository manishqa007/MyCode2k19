package LinkList;

import java.util.HashSet;

/*Solution 1: Hashing Approach:
Traverse the list one by one and keep putting the node addresses in a Hash Table. 
At any point, if NULL is reached then return false and if next of current node points to any of the previously stored nodes in Hash then return true. 
*/public class Linklist11_DetectLoopInLinklist_Method1 {

	static Node head; // head of list

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// Returns true if there is a loop in linked list else returns false.
	static boolean detectLoop() {
		Node h =head;
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			// If we have already has this node in hashmap it means their is a cycle
			// (Because you we encountering the node second time).
			if (s.contains(h))
				return true;
			
			s.add(h);// If we are seeing the node for the first time, insert it in hash

			h = h.next;
		}
		return false;
	}

	public static void main(String[] args) {
		Linklist11_DetectLoopInLinklist_Method1 llist = new Linklist11_DetectLoopInLinklist_Method1();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		
		llist.head.next.next.next.next = llist.head; // Create loop for testing

		if (detectLoop())
			System.out.println("Loop found");
		else
			System.out.println("No Loop");
	}

}

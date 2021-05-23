package LinkList;

// Simple Node creation
public class LinkList01_Node {

	Node head; // head of the list whose value by default is null

	/* Linked list Node.  This inner class is made static so that main() can access it */
	static class Node { 
		int data; // You can use any data type here as per need
		Node next;

		// Constructor to create a new node
		Node(int d) {
			data = d;
			next = null;
		}
	}
}

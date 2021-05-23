package LinkList;

/*
1. Initialize three pointers prev as NULL, curr as head and next as NULL.
2. Iterate through the linked list. In loop, do following. 
// Before changing next of current, store next node 
   next = curr->next
// Now change next of current, This is where actual reversing happens 
   curr->next = prev 
// Move prev and curr one step forward 
   prev = curr 
   curr = next
*/
public class Linklist09_ReverseLinklist {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	public void reverse() { // return type is of Node
		Node prev = null;
		Node itr = head; // this is the head node which is to be reversed
		Node next = null;
		while (itr != null) {
			next = itr.next; // Before changing next of current, store next node
			itr.next = prev; // Now change next of itr, This is where actual reversing happens  
			prev = itr;// Move prev one step forward
			itr = next;// Move itr one step forward
		}
		head = prev;
	}

	// prints content of double linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		Linklist09_ReverseLinklist list = new Linklist09_ReverseLinklist();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		
		list.reverse();
		
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}

}

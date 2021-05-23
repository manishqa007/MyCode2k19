package LinkList;


// Issue while printing data
public class LinkList02_NodeCreationAndItsLinking {
	Node head;

//	Linked list Node.  This inner class is made static so that main() can access it
	static class Node { 
		private int data;
		public Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String args[]) {
		LinkList02_NodeCreationAndItsLinking list = new LinkList02_NodeCreationAndItsLinking();

		list.head = new Node(3);
		Node second = new Node(7);
		Node third = new Node(6);
		/* Three nodes have been allocated dynamically.
        We have references to these three blocks as head, second and third */
		list.head.next = second; // Link first node with the second node
		second.next = third; 	 //Now next of the second Node refers to third.  
//		So all three nodes are linked.
	}
}

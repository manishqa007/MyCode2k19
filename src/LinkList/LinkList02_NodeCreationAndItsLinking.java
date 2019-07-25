package LinkList;


// Issue while printing data
public class LinkList02_NodeCreationAndItsLinking {
	Node head;

	static class Node {
		private int data;
		public Node next;

		public Node(int data) {
			next = null;
			data = data;
		}
	}

	public static void main(String args[]) {
		LinkList02_NodeCreationAndItsLinking list = new LinkList02_NodeCreationAndItsLinking();

		list.head = new Node(3);
		Node second = new Node(7);
		Node third = new Node(6);

		list.head.next = second;
		second.next = third;
	}
}

package LinkList;

public class LinkList03_InsertionAtFront {

	Node head;

	static class Node {
		private int data;
		public Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void addAtFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head; // This line is useless in case if we are adding node for first time.
		head = newNode;
	}

	public void printList() {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String args[]) {
		LinkList03_InsertionAtFront Llist = new LinkList03_InsertionAtFront();
		Llist.addAtFront(5);
		Llist.addAtFront(7);
		Llist.addAtFront(6);
		Llist.printList();
		Llist.addAtFront(4);
		Llist.printList();
	}

}

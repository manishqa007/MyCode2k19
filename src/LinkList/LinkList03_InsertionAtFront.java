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
		if (head == null) { // This is when there in no value in list
			head = newNode;
		} else {
			newNode.next = head;//Make next of new Node as head
			head = newNode; //Move the head to point to new Node
		}
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

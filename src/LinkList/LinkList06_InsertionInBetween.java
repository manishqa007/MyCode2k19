package LinkList;

public class LinkList06_InsertionInBetween {

	Node head, itr, last;

	class Node {
		private int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insertionAtFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertionAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			newNode.next = head;
			head = newNode;
			return;
		}
		last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}

	public void insertionInBetween(int position, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		itr = head;
		int counter = 1;
		while (counter < position - 1) {
			itr = itr.next;
			counter++;
		}
		newNode.next = itr.next;
		itr.next = newNode;
	}

	public void print() {
		itr = head;
		while (itr != null) {
			System.out.print(itr.data + " ");
			itr = itr.next;
		}
		System.out.println("");
	}

	public static void main(String args[]) {
		LinkList06_InsertionInBetween list = new LinkList06_InsertionInBetween();

		list.insertionAtFront(2);
		list.insertionAtFront(1);
		list.insertionAtFront(7);
		list.print();
		list.insertionAtEnd(9);
		list.insertionAtFront(8);
		list.print(); // 8 7 1 2 9
		list.insertionInBetween(2, 3);
		list.print(); // 8 2 7 1 2 9
	}

}

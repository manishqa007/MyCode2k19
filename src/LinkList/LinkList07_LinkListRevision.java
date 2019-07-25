package LinkList;

public class LinkList07_LinkListRevision {
	Node head, itr;

	class Node {
		private int data;
		public Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}

	public void insertionAtBegning(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void insertionAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		itr = head;
		while (itr.next != null) {
			itr = itr.next;
		}
		itr.next = newNode;
	}

	public void insertionInBetween(int position, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		itr = head;
		int counter = 1;
		while (counter < position-1) {
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
		System.out.println();
	}

	public static void main(String[] args) {
		LinkList07_LinkListRevision list = new LinkList07_LinkListRevision();
		list.insertionAtEnd(9);
		list.insertionAtBegning(2);
		list.insertionAtBegning(7);
		list.insertionAtBegning(1);
		list.print(); // 1 7 2 9
		list.insertionAtEnd(5);
		list.print();// 1 7 2 9 5
		list.insertionAtEnd(8);
		list.print(); // 1 7 2 9 5 8
		list.insertionInBetween(2, 3);
		list.print(); // 1 3 7 2 9 5 8
		list.insertionInBetween(5, 6);
		list.print(); // 1 3 7 2 6 9 5 8
	}

}

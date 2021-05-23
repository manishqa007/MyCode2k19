package LinkList;

public class LinkList04_InsertionAtFront2 {
	Node head,itr;

	class Node {
		private int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void addOnFront(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void print() {
		itr = head;
		while (itr != null) {
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
		System.out.println("");
	}

	public static void main(String args[]) {
		LinkList04_InsertionAtFront2 list = new LinkList04_InsertionAtFront2();
		list.addOnFront(3);
		list.addOnFront(5);
		list.addOnFront(7);
		list.print();
		list.addOnFront(3);
		list.print();
		list.addOnFront(8);
		list.print();
	}
}

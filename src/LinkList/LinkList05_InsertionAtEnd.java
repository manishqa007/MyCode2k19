package LinkList;

public class LinkList05_InsertionAtEnd {
	Node head, last, itr;

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
		newNode.next = head;
		head = newNode;
	}

	public void addOnEndMethod1(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			newNode.next = head; //This is useless
			head = newNode;
			return;
		}
		last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}


	public void print() {
		itr = head;
		while (itr != null) {
			System.out.print(itr.data + " ");
			itr = itr.next;
		}
		System.out.println("");

	}
 
	public static void main(String[] args) {
		LinkList05_InsertionAtEnd list = new LinkList05_InsertionAtEnd();
		list.addOnEndMethod1(10);
		list.addOnFront(2);
		list.addOnFront(6);
		list.print();
		list.addOnEndMethod1(7);
		list.print();
		list.addOnFront(9);
		list.print();
		list.addOnFront(3);
		list.print();
	}

}

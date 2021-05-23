package LinkList;

public class LinkList08_Deletion {
	Node head;

	public static class Node {
		public Node next;
		private int data;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void InsertionAtBegning(int d) {
		Node newNode = new Node(d);
		if (head != null) {
			newNode.next = head;
		}
		head = newNode;
	}

	public void deletionAtEnd(int key) {
		Node prev = null, temp;
		temp = head;

		//TC-1: If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}

		//TC-2: Search for the key to be deleted, keep track of the previous node as we need to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		//TC-3: If key was not present in linked list
		if (temp == null) {
			return;
		}
		prev.next = temp.next;
	}

	public void print() {
		Node itr = head;
		while (itr != null) {
			System.out.print(itr.data + " ");
			itr = itr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkList08_Deletion list = new LinkList08_Deletion();
		list.InsertionAtBegning(5);
		list.InsertionAtBegning(4);
		list.InsertionAtBegning(7);
		list.print();
		list.deletionAtEnd(5);
		list.print();
		list.InsertionAtBegning(8);
		list.InsertionAtBegning(1);
		list.print();
		list.deletionAtEnd(1);
		list.print();
	}
}





















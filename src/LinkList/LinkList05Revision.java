package LinkList;

public class LinkList05Revision {
	Node head,last, itr;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	private void print() {
		itr = head;
		while (itr != null) {
			System.out.print(itr.data + " ");
			itr = itr.next;
		}
	}

	private void addAtLast(int data) {
		Node newNode = new Node(data);
		itr = head;
		if(head == null) {
			head = newNode;
			return;
		}
		last = head;
		while(last.next !=null) {
			last = last.next;
			}
			last.next= newNode;
		}

	private void addAtFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		LinkList05Revision list = new LinkList05Revision();
		list.addAtFront(4);
		list.addAtFront(6);
		list.addAtFront(23);
		list.addAtLast(1);
		list.print();
	}

}

package LinkList;

public class LinkList06_Revision {
	static Node head, last, itr;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void addAtFront(int data) {
		Node newNode = new Node(data);
		if (head == null) { // this is when there in no value in list
			head = newNode;
			return;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public static void addAtLast(int data) {
		Node newNode = new Node(data);
		last = head;
		if (head == null) {
			head = newNode;
			return;
		}
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}
	
	public static void addInBetween(int position, int data) {
		Node newNode = new Node(data);
		itr = head;
		int index;
		if(head==null) {
			head=newNode;
			return;
		}else {
			index=0;
			while(index<position-1) {
				itr=itr.next;
				index++;
			}
			newNode.next=itr.next;
			itr.next=newNode;
		}
		
	}

	public static void print() {
		itr = head;
		while (itr != null) {
			System.out.print(itr.data + " ");
			itr = itr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		addAtFront(4);
		addAtFront(6);
		addAtLast(3);
		print();
		addInBetween(2,7);
		print();
	}

}

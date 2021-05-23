package LinkList;

import LinkList.LinkList06_InsertionInBetween.Node;

public class LinkList08_Rivision {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void deleteAtIndex() {
		
	}




	public static void main(String args[]) {
		LinkList08_Rivision list = new LinkList08_Rivision();
		list.push(4);
		list.push(5);
		list.push(2);
		list.print();
//		System.out.println();
		list.push(9);
		list.print();
		list.push(2); //at pos 2
		System.out.println();
		list.print();
	}

	public void push(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	private void print() {
		Node itr = head;
		while (itr != null) {
			System.out.print(itr.data + " ");
			itr = itr.next;

		}

	}
}

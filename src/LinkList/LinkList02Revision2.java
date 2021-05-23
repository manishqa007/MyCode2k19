package LinkList;

import LinkList.LinkList06_InsertionInBetween.Node;

public class LinkList02Revision2 {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	

	private void print() {
		Node itr= head;
		while(itr!=null) {
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
		System.out.println();
	}

	private void addAtFront(int d) {
		Node newNode  = new Node(d);
		newNode.next = head;
		head = newNode;
		
	}

	private void addAtMid(int d, int pos) {
		Node newNode= new Node(d);
		Node itr=head;
		int count = 0;
		if(head==null) {
			head = newNode;
			return;
		}
		while(count<pos-1) {
			itr = itr.next;
			count++;
		}
		newNode.next = itr.next;
		itr.next = newNode;
	}
	
	private void addAtlast(int d) {
		Node newNode = new Node(d);
		Node itr = head;
		while(itr.next!=null) {
			itr=itr.next;
		}
		itr.next = newNode;
		
	}

	public static void main(String[] args) {
		LinkList02Revision2 list = new LinkList02Revision2();
		list.addAtFront(3);
		list.addAtFront(2);
		list.addAtFront(5);
		list.print();
		list.addAtlast(7);
		list.print();
		list.addAtMid(4,2);
		list.print();
	}




}

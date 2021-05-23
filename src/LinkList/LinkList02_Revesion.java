package LinkList;

public class LinkList02_Revesion {
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printList() {
		Node iterator = head;
		while(iterator !=null) {
			System.out.println(iterator.data);
			iterator = iterator.next;
		}
	}
	public static void main(String args[]) {
		LinkList02_Revesion  list = new LinkList02_Revesion();
		
		list.head = new Node(9);
		Node second = new Node(4);
		Node third = new Node(7);
		
		list.head.next = second;
		second.next = third;
		
		list.printList();
	}
}

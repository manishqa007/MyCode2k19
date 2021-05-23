package LinkList;

public class LinkList04_Revision {
	Node head,itr;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void addAtFont(int data) {
		Node newNode= new Node(data);
		newNode.next=head; // This line is useless in case if we are adding node for first time.
		head = newNode;
	}

	public void print() {
		itr = head;
		while(itr!=null) {
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
	}
	
	public static void main(String args[]) {
		LinkList04_Revision list = new LinkList04_Revision();
		list.addAtFont(4);
		list.addAtFont(6);
		list.addAtFont(23);
		list.print();
	}
}

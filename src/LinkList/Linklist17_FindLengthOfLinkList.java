package LinkList;

public class Linklist17_FindLengthOfLinkList {

	Node head; // head of list

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void findLengthOfList() {
		Node itr = head;
		int length = 0;
		while (itr != null) {
			length++;
			itr = itr.next;
		}
		System.out.println("length is: " + length);
	}

	public static void main(String args[]) {
		Linklist17_FindLengthOfLinkList llist = new Linklist17_FindLengthOfLinkList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);
		llist.push(1);
		llist.push(11);
//		llist.print();
		llist.findLengthOfList();
	}
}

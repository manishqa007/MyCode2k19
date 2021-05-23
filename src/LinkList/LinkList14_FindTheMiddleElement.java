package LinkList;

public class LinkList14_FindTheMiddleElement {
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
	
	public void print() {
		Node itr = head;
		while (itr != null) {
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
		System.out.println("");
	}
	
	void detectMiddleElement() {
		Node slow,fast;
		slow = head;
		fast = head;
		while (fast.next != null  && fast!=null ) {//fast_ptr != null && fast_ptr.next != null
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("mid is: "+slow.data);
		
	}

	public static void main(String args[]) {
		LinkList14_FindTheMiddleElement llist = new LinkList14_FindTheMiddleElement();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);
		llist.push(1);
//		llist.push(11);
		llist.print();
		llist.detectMiddleElement();
	}
}

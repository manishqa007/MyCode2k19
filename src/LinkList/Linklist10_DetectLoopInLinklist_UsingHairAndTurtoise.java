package LinkList;

// Flyod's cycle detection algorithim
public class Linklist10_DetectLoopInLinklist_UsingHairAndTurtoise {
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

	void detectLoop() {
		Node turtiose = head, hair = head;
		int flag = 0;
		while (turtiose != null && hair != null && hair.next != null) {
			turtiose = turtiose.next;
			hair = hair.next.next;
			if (turtiose == hair) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Loop found");
		else
			System.out.println("Loop not found");
	}

	public static void main(String args[]) {
		Linklist10_DetectLoopInLinklist_UsingHairAndTurtoise llist = new Linklist10_DetectLoopInLinklist_UsingHairAndTurtoise();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		llist.head.next.next.next.next = llist.head;

		llist.detectLoop();
	}
}

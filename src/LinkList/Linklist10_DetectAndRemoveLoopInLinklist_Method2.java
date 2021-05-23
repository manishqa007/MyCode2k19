package LinkList;

public class Linklist10_DetectAndRemoveLoopInLinklist_Method2 {
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
				removeLoop(turtiose, head);
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Loop found");
		else
			System.out.println("Loop not found");
	}

	void removeLoop(Node turtoise, Node curr) {
		Node ptr1 = null, ptr2 = null;

		/*Set a pointer to the beginning of the Linked List and move it one by one to
		  find the first node which is part of the Linked List*/
		ptr1 = curr;
		while (1 == 1) {

			/* Now start a pointer from loop_node and check if it ever reaches ptr2 */
			ptr2 = turtoise;
			while (ptr2.next != turtoise && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}

			/* If ptr2 reahced ptr1 then there is a loop. So break the loop */
			if (ptr2.next == ptr1) {
				break;
			}

			/* If ptr2 did't reach ptr1 then try the next node after ptr1 */
			ptr1 = ptr1.next;
		}

		/*After the end of loop ptr2 is the last node of the loop. So make next of ptr2 as NULL*/
		ptr2.next = null;
	}

	void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String args[]) {
		Linklist10_DetectAndRemoveLoopInLinklist_Method2 llist = new Linklist10_DetectAndRemoveLoopInLinklist_Method2();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);
		llist.push(1);
		llist.head.next.next.next.next = llist.head;

		llist.detectLoop();
		llist.printList(); // print after loop removal

	}
}

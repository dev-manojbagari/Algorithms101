package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListFindAndRemoveLoopIfExists {

    LinkedList.Node head, tail;

    public Node findAndRemoveLoop(Node head) {
	if (head == null || head.next == null)
	    return head;

	Node slow = head;
	Node fast = head;

	while (fast.next != null && fast.next.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;

	    if (slow == fast)
		removeLoop(head, slow);
	}

	return head;
    }

    private void removeLoop(Node head, Node slow) {

	Node ptr1 = slow;
	Node ptr2 = slow;
	int cycleLength = 1;

	while (ptr2.next != ptr1) {
	    ptr2 = ptr2.next;
	    cycleLength++;
	}

	ptr1 = head;

	ptr2 = head;
	int count = 1;

	while (count != cycleLength) {
	    ptr2 = ptr2.next;
	    count++;
	}

//	for (int count = 1; count != cycleLength; count++, ptr2 = ptr2.next) {
//
//	}

	while (ptr2.next != ptr1) {
	    ptr1 = ptr1.next;
	    ptr2 = ptr2.next;
	}

	ptr2.next = null;

    }

}

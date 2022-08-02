package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListLoopCheck {

    LinkedList.Node head, tail;

    public boolean hasCycle(Node head) {

	Node slow = head;
	Node fast = head;

	while (fast.next != null && fast.next.next != null) {

	    slow = slow.next;
	    fast = fast.next.next;

	    if (slow == fast)
		return true;

	}

	return false;
    }

}

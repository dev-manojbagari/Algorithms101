package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveGreaterValueOnRightSide {

    LinkedList.Node head, tail;

    public void removeGreaterRight() {

	if (head == null)
	    return;

	head = reverse();
	Node prev = head;
	Node curr = head.next;
	int max = head.val;

	while (curr != null) {
	    if (curr.val >= max) {
		max = curr.val;
		prev = curr;
		curr = curr.next;
	    } else {
		prev.next = curr.next;
		curr.next = null;
		curr = prev.next;
	    }
	}

	head = reverse();

    }

    private Node reverse() {
	Node prev = null;
	Node curr = head;
	Node next = null;

	while (curr != null) {
	    next = curr.next;
	    curr.next = prev;
	    prev = curr;
	    curr = next;
	}

	return prev;
    }

}

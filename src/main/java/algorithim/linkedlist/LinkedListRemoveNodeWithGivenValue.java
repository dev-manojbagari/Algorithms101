package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveNodeWithGivenValue {

    LinkedList.Node head, tail;

    public void remove(int i) {

	if (head == null)
	    return;

	Node curr = head;
	Node prev = null;

	while (curr != null && curr.val != i) {
	    prev = curr;
	    curr = curr.next;
	}

	if (curr == null)
	    return;

	if (prev == null)
	    head = head.next;
	else {
	    prev.next = curr.next;
	    curr.next = null;
	}
    }

}

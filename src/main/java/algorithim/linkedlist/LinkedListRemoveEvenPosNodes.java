package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveEvenPosNodes {

    LinkedList.Node head, tail;

    public void removeAllEvenPos() {

	if (head == null)
	    return;

	Node curr = head.next;
	Node prev = head;

	while (curr != null) {

	    prev.next = curr.next;
	    curr.next = null;

	    prev = prev.next;
	    curr = prev.next;

	}

    }

}

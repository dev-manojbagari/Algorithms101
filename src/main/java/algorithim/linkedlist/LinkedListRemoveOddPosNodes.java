package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveOddPosNodes {

    LinkedList.Node head, tail;

    public void removeAllOddPos() {

	if (head == null)
	    return;

	Node prev = null;
	Node curr = head;

	while (curr != null) {

	    if (prev == null) {
		Node temp = head;
		head = head.next;
		temp.next = null;
		if (head == null)
		    return;
		prev = head;
		curr = head.next;
	    } else {

		prev.next = curr.next;
		curr.next = null;

		prev = prev.next;
		curr = prev.next;

	    }

	}

    }

}

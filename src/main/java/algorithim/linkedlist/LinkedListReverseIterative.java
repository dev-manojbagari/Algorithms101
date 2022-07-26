package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListReverseIterative {

    LinkedList.Node head, tail;

    public void reverse() {

	Node prev = null;
	Node curr = head;
	Node next = null;

	while (curr != null) {
	    next = curr.next;
	    curr.next = prev;
	    prev = curr;
	    curr = next;
	}

	head = prev;

    }

}

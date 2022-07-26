package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveAllEvenValueNodes {

    LinkedList.Node head, tail;

    public void removeAllEvenValueNodes() {

	if (head == null)
	    return;

	Node curr = head;
	Node prev = null;

	while (curr != null) {
	    if (curr.val % 2 == 0) {

		if (prev == null) {
		    Node temp = head;
		    head = head.next;
		    temp.next = null;
		    curr = head;
		} else {
		    prev.next = curr.next;
		    curr.next = null;
		    curr = prev.next;
		}

	    } else {
		prev = curr;
		curr = curr.next;
	    }
	}
    }

}

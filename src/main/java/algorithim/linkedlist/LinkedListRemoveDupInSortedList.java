package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveDupInSortedList {

    LinkedList.Node head, tail;

    public void removeDup() {

	if (head == null || head.next == null)
	    return;

	Node prev = head;
	Node curr = head.next;

	while (curr != null) {
	    while (curr != null && prev.val == curr.val) {
		curr = curr.next;
	    }

	    prev.next = curr;
	    if (curr == null)
		break;
	    prev = curr;
	    curr = curr.next;

	}

    }

    public void removeDup2() {
	Node curr = head;

	while (curr != null && curr.next != null) {
	    if (curr.val == curr.next.val)
		curr.next = curr.next.next;
	    else
		curr = curr.next;
	}

    }
}

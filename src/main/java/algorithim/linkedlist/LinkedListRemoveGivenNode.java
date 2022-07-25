package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveGivenNode {

    LinkedList.Node head, tail;

    public void remove(Node node) {

	if (head == null)
	    return;

	if (node.next != null) {
	    Node temp = node.next;
	    node.val = node.next.val;
	    node.next = node.next.next;
	    temp.next = null;
	} else {
	    Node curr = head;
	    Node prev = null;

	    while (curr != null && curr != node) {
		prev = curr;
		curr = curr.next;
	    }

	    if (prev == null) {
		Node temp = head;
		head = head.next;
		temp.next = null;
	    } else {
		prev.next = curr.next;
		curr.next = null;
	    }

	}

    }

}

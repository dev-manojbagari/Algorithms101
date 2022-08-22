package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRotateRight {

    LinkedList.Node head, tail;

    public static Node rotate(Node head, int k) {
	if (head == null)
	    return head;

	int len = 1;
	Node tail = head;

	while (tail.next != null) {
	    len++;
	    tail = tail.next;
	}

	k = k % len;

	if (k == 0)
	    return head;

	int count = 1;
	Node curr = head;
	while (count != len - k) {
	    curr = curr.next;
	    count++;
	}

	tail.next = head;

	head = curr.next;
	curr.next = null;

	return head;
    }

}

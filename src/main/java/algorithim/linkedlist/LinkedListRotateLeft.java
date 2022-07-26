package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRotateLeft {

    LinkedList.Node head, tail;

    public void rotateLeft(int k) {

	if (head == null)
	    return;

	int len = length();

	k = k % len;

	int count = 1;
	Node curr = head;

	while (count != k && curr != null) {
	    curr = curr.next;
	    count++;
	}

	if (curr == null || curr.next == null)
	    return;

	Node newHead = curr.next;
	Node temp = curr.next;
	curr.next = null;

	while (temp.next != null)
	    temp = temp.next;

	temp.next = head;

	head = newHead;

    }

    private int length() {

	Node curr = head;
	int count = 0;
	while (curr != null) {
	    curr = curr.next;
	    count++;
	}

	return count;
    }

}

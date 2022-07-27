package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRotateRight {

    LinkedList.Node head, tail;

    // 1 2 3 4 5
    // 4 5 1 2 3

    public static Node rotateLeft(Node head, int k) {
	if (head == null)
	    return head;

	int len = length(head);

	k = k % len;

	Node ptr1 = head;

	int count = 1;
	while (count != k && ptr1 != null) {
	    ptr1 = ptr1.next;
	    count++;
	}

	if (ptr1 == null)
	    return head;

	Node newHead = ptr1.next;
	Node temp = newHead;
	ptr1.next = null;

	while (temp.next != null)
	    temp = temp.next;

	temp.next = head;
	head = newHead;
	return head;
    }

    private static int length(Node head) {

	Node curr = head;
	int count = 0;
	while (curr != null) {
	    curr = curr.next;
	    count++;
	}

	return count;
    }

    public static Node rotate(Node head, int k) {
	head = reverse(head);
	head = rotateLeft(head, k);
	head = reverse(head);
	return head;
    }

    private static Node reverse(Node head) {
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

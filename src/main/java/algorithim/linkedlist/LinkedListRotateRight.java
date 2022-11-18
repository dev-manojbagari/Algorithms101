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

    public Node rotateRight(Node head, int k) {
	if (head == null || k == 0)
	    return head;

	int len = getLen(head);
	k = k % len;
	if (k == 0)
	    return head;

	Node ptr1 = head;
	Node ptr2 = head;
	int count = 1;
	while (count != k + 1) {
	    count++;
	    ptr2 = ptr2.next;
	}

	while (ptr2.next != null) {
	    ptr1 = ptr1.next;
	    ptr2 = ptr2.next;
	}
	Node newHead = ptr1.next;
	ptr1.next = null;
	ptr2.next = head;
	head = newHead;
	return head;
    }

    public Node rotateLeft(Node head, int k) {
	if (head == null)
	    return head;

	int count = 1;
	Node curr = head;

	while (count != k) {
	    count++;
	    curr = curr.next;
	}

	Node newHead = curr.next;
	curr.next = null;
	curr = newHead;
	while (curr.next != null) {
	    curr = curr.next;
	}

	curr.next = head;
	head = newHead;
	return head;
    }

    int getLen(Node head) {
	int count = 0;
	while (head != null) {
	    count++;
	    head = head.next;
	}
	return count;
    }

}

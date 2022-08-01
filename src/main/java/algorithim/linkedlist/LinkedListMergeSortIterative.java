package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListMergeSortIterative {

    LinkedList.Node head, tail;

    public Node sortList(Node head) {
	if (head == null || head.next == null)
	    return head;

	Node dummy = new Node(-1);
	dummy.next = head;

	int n = 0;
	while (head != null) {
	    head = head.next;
	    n++;
	}

	for (int step = 1; step < n; step *= 2) {
	    Node pre = dummy;
	    Node curr = dummy.next;

	    while (curr != null) {
		Node left = curr;
		Node right = splitList(left, step);
		curr = splitList(right, step);
		pre = sortedMerge(left, right, pre);
	    }
	}

	return dummy.next;

    }

    private Node sortedMerge(Node left, Node right, Node pre) {

	Node curr = pre;

	while (left != null && right != null) {

	    if (left.val <= right.val) {
		curr.next = left;
		left = left.next;
	    } else {
		curr.next = right;
		right = right.next;
	    }
	    curr = curr.next;

	}

	if (left != null) {
	    curr.next = left;
	} else if (right != null) {
	    curr.next = right;
	}

	while (curr.next != null)
	    curr = curr.next;

	return curr;
    }

    private Node splitList(Node head, int step) {

	if (head == null)
	    return head;

	for (int i = 1; head.next != null && i < step; i++) {
	    head = head.next;
	}

	Node rest = head.next;
	head.next = null;

	return rest;
    }

}

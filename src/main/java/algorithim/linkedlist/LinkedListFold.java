package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListFold {

    LinkedList.Node head, tail;

    public Node reorderList(Node head) {

	if (head == null || head.next == null)
	    return head;

	Node mid = getMiddle(head);
	Node ptr1 = head;
	Node ptr2 = reverse(mid.next);
	mid.next = null;
	while (ptr2 != null) {
	    Node temp = ptr2;
	    ptr2 = ptr2.next;
	    temp.next = ptr1.next;
	    ptr1.next = temp;
	    ptr1 = ptr1.next.next;
	}

	return head;
    }

    private Node reverse(Node head) {

	if (head == null || head.next == null)
	    return head;

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

    private Node getMiddle(Node head) {

	Node slow = head;
	Node fast = head.next;

	while (fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	}

	return slow;
    }

}

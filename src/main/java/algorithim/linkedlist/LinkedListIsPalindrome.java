package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListIsPalindrome {

    LinkedList.Node head, tail;

    public boolean isPalindrome(Node head) {

	if (head == null || head.next == null)
	    return true;

	Node mid = getMiddle(head);
	Node midNext = mid.next;
	mid.next = null;

	Node tempHead = reverse(midNext);
	Node ptr1 = head;
	Node ptr2 = tempHead;
	while (ptr1 != null && ptr2 != null) {
	    if (ptr1.val != ptr2.val) {
		mid.next = reverse(tempHead);
		return false;
	    }

	    ptr1 = ptr1.next;
	    ptr2 = ptr2.next;
	}

	mid.next = reverse(tempHead);
	return true;
    }

    private Node reverse(Node head) {

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

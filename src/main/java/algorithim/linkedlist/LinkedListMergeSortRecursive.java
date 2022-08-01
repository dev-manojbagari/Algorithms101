package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListMergeSortRecursive {

    LinkedList.Node head, tail;

    public Node sortList(Node head) {

	if (head == null || head.next == null)
	    return head;

	return mergeSort(head);

    }

    private Node mergeSort(Node head) {

	if (head == null || head.next == null)
	    return head;

	Node mid = mid(head);
	Node midNext = mid.next;
	mid.next = null;

	Node left = mergeSort(head);
	Node right = mergeSort(midNext);

	return sortedMerge(left, right);
    }

    public Node sortedMerge(Node head1, Node head2) {

	if (head1 == null && head2 == null)
	    return null;

	Node ptr1 = head1;
	Node ptr2 = head2;
	Node newHead = null, ptr = null;

	Node temp = null;
	while (ptr1 != null && ptr2 != null) {

	    if (ptr1.val <= ptr2.val) {
		temp = ptr1;
		ptr1 = ptr1.next;
		temp.next = null;
	    } else {
		temp = ptr2;
		ptr2 = ptr2.next;
		temp.next = null;
	    }

	    if (newHead == null)
		newHead = ptr = temp;
	    else {
		ptr.next = temp;
		ptr = ptr.next;
	    }
	}

	if (ptr1 != null)
	    ptr.next = ptr1;
	else if (ptr2 != null)
	    ptr.next = ptr2;

	return newHead;
    }

    private Node mid(Node head) {
	Node slow = head;
	Node fast = head.next;

	while (fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	}

	return slow;
    }

}

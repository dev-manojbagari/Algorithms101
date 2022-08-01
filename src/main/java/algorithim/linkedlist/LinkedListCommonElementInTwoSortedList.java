package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListCommonElementInTwoSortedList {

    LinkedList.Node head, tail, head1, head2;

    public Node getCommonElem(Node head1, Node head2) {

	if (head1 == null || head2 == null)
	    return null;

	Node ptr = null, ptr1 = head1, ptr2 = head2;
	Node tempHead = null;
	while (ptr1 != null && ptr2 != null) {
	    if (ptr1.val == ptr2.val) {
		if (tempHead == null)
		    tempHead = ptr = new Node(ptr1.val);
		else {
		    ptr.next = new Node(ptr1.val);
		    ptr = ptr.next;
		}

		ptr1 = ptr1.next;
		ptr2 = ptr2.next;

	    } else if (ptr1.val < ptr2.val) {
		ptr1 = ptr1.next;
	    } else {
		ptr2 = ptr2.next;
	    }
	}

	return tempHead;
    }

}
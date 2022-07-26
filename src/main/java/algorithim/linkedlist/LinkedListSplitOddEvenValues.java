package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListSplitOddEvenValues {

    LinkedList.Node head, head1, head2;

    public void splitOddEvenValues() {

	if (head == null)
	    return;

	Node curr = head;
	Node ptr1 = head1;
	Node ptr2 = head1;

	while (curr != null) {

	    Node temp = curr;
	    curr = curr.next;
	    temp.next = null;

	    if (temp.val % 2 != 0) {
		if (head1 == null) {
		    head1 = ptr1 = temp;
		} else {
		    ptr1.next = temp;
		    ptr1 = ptr1.next;
		}

	    } else {

		if (head2 == null) {
		    head2 = ptr2 = temp;
		} else {
		    ptr2.next = temp;
		    ptr2 = ptr2.next;
		}

	    }

	}
	head = null;
    }

}

package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRearrangeIntoOddEvenList {

    LinkedList.Node head, tail;

    public void rearrangeOddEven() {

	if (head == null || head.next == null)
	    return;

	Node curr = head;
	Node evenHead = null;
	Node evenPtr = null;
	Node oddHead = null;
	Node oddPtr = null;

	while (curr != null) {

	    Node temp = curr;
	    curr = curr.next;
	    temp.next = null;

	    if (temp.val % 2 == 0) {
		if (evenHead == null) {
		    evenHead = evenPtr = temp;
		} else {
		    evenPtr.next = temp;
		    evenPtr = evenPtr.next;
		}
	    } else {
		if (oddHead == null) {
		    oddHead = oddPtr = temp;
		} else {
		    oddPtr.next = temp;
		    oddPtr = oddPtr.next;
		}
	    }

	}

	oddPtr.next = evenHead;
	head = oddHead;

    }

}

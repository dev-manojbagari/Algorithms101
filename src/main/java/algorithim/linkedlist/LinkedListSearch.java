package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListSearch {

    LinkedList.Node head, tail;

    public boolean find(int i) {

	if (head == null)
	    return false;

	Node curr = head;

	while (curr != null && curr.val != i)
	    curr = curr.next;

	return curr != null;
    }

}

package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListCount {

    LinkedList.Node head, tail;

    public int count(int i) {

	if (head == null)
	    return 0;

	Node curr = head;

	int count = 0;
	while (curr != null) {
	    if (curr.val == i)
		count++;
	    curr = curr.next;

	}

	return count;
    }

}

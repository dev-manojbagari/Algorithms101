package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListAddLast {

    LinkedList.Node head, tail;

    public void addLast(int i) {

	Node node = new LinkedList.Node(i);

	if (head == null)
	    head = tail = node;
	else {
	    tail.next = node;
	    tail = node;
	}

    }

}

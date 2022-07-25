package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListAddFirst {

    LinkedList.Node head, tail;

    public void addFirst(int i) {

	Node node = new LinkedList.Node(i);
	if (head == null)
	    head = tail = node;
	else {
	    node.next = head;
	    head = node;
	}

    }

}

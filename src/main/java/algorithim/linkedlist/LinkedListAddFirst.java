package algorithim.linkedlist;

public class LinkedListAddFirst {

    LinkedList head, tail;

    public void addFirst(int i) {

	LinkedList node = new LinkedList(i);
	if (head == null)
	    head = tail = node;
	else {
	    node.next = head;
	    head = node;
	}

    }

}

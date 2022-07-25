package algorithim.linkedlist;

public class LinkedListAddLast {

    LinkedList head, tail;

    public void addLast(int i) {

	LinkedList node = new LinkedList(i);

	if (head == null)
	    head = tail = node;
	else {
	    tail.next = node;
	    tail = node;
	}

    }

}

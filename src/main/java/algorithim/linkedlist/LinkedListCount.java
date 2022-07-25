package algorithim.linkedlist;

public class LinkedListCount {

    LinkedList head, tail;

    public int count(int i) {

	if (head == null)
	    return 0;

	LinkedList curr = head;

	int count = 0;
	while (curr != null) {
	    if (curr.val == i)
		count++;
	    curr = curr.next;

	}

	return count;
    }

}

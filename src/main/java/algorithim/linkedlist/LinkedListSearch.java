package algorithim.linkedlist;

public class LinkedListSearch {

    LinkedList head, tail;

    public boolean find(int i) {

	if (head == null)
	    return false;

	LinkedList curr = head;

	while (curr != null && curr.val != i)
	    curr = curr.next;

	return curr != null;
    }

}

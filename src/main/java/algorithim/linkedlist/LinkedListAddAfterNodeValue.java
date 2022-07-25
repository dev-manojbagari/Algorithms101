package algorithim.linkedlist;

public class LinkedListAddAfterNodeValue {

    LinkedList head, tail;

    public void addAfterNodeValue(int i, int j) {

	if (head == null)
	    return;

	LinkedList newNode = new LinkedList(j);

	LinkedList curr = head;

	while (curr != null && curr.val != i)
	    curr = curr.next;

	if (curr == null)
	    return;

	LinkedList temp = curr.next;
	curr.next = newNode;
	newNode.next = temp;

    }

}

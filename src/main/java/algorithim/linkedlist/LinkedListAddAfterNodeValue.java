package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListAddAfterNodeValue {

    LinkedList.Node head, tail;

    public void addAfterNodeValue(int i, int j) {

	if (head == null)
	    return;

	Node newNode = new LinkedList.Node(j);

	Node curr = head;

	while (curr != null && curr.val != i)
	    curr = curr.next;

	if (curr == null)
	    return;

	Node temp = curr.next;
	curr.next = newNode;
	newNode.next = temp;

    }

}

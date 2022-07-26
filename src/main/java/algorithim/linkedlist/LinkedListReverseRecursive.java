package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListReverseRecursive {

    LinkedList.Node head, tail;

    public void reverse() {
	if (head == null)
	    return;

	reverse(head);
    }

    private Node reverse(Node node) {
	if (node.next == null) {
	    return node;
	}

	Node tailNode = reverse(node.next);

	node.next.next = node;
	node.next = null;

	return tailNode;
    }

}

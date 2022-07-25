package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveAlllNodesWithGivenValue {

    LinkedList.Node head, tail;

    public void addAfterNode(Node node, int i) {
	Node newNode = new LinkedList.Node(i);
	Node temp = node.next;
	node.next = newNode;
	newNode.next = temp;
    }

    public void removeAll(int i) {

	if (head == null)
	    return;

	Node curr = head;
	Node prev = null;
	Node temp = null;
	while (curr != null) {
	    if (curr.val == i) {
		if (prev == null) {
		    temp = head;
		    head = head.next;
		    temp.next = null;
		    curr = head;
		} else {
		    prev.next = curr.next;
		    curr.next = null;
		    curr = prev.next;
		}
	    } else {
		prev = curr;
		curr = curr.next;
	    }

	}
    }

}

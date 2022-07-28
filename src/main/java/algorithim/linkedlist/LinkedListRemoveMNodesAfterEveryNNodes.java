package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveMNodesAfterEveryNNodes {

    LinkedList.Node head, tail;

    public void removeMafterN(Node head, int M, int N) {

	if (head == null)
	    return;

	if (M == 0) {
	    head = null;
	    return;
	}

	Node prev = null;
	Node curr = head;

	int countM = 0;
	int countN = 0;
	while (curr != null) {

	    while (countM < M && curr != null) {
		prev = curr;
		curr = curr.next;
		countM++;
	    }
	    countM = 0;
	    while (countN < N && curr != null) {
		curr = curr.next;
		countN++;
	    }
	    prev.next = curr;
	    countN = 0;

	}

    }

}

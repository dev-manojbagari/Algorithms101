package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListReverseInGroups {

    LinkedList.Node head, tail;

    public Node reverseInGroup(Node head, int k) {

	if (head == null)
	    return head;

	int len = length(head);

	if (len < k)
	    return head;

	int feq = len / k;

	Node dummy = new Node(-1);

	Node tail = head;
	dummy.next = head;
	Node pre = dummy;
	while (feq > 0) {

	    int count = 1;
	    while (count != k) {
		Node temp = tail.next;
		tail.next = tail.next.next;
		temp.next = pre.next;
		pre.next = temp;
		count++;
	    }
	    if (tail == null)
		break;
	    pre = tail;
	    tail = tail.next;
	    feq--;
	}

	return dummy.next;

    }

    private int length(Node head) {
	Node curr = head;
	int count = 0;
	while (curr != null) {
	    curr = curr.next;
	    count++;
	}
	return count;
    }

}

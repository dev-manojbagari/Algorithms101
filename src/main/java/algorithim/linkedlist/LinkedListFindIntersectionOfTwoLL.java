package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListFindIntersectionOfTwoLL {

    LinkedList.Node head, head1, head2;

    public Node intersectionPoint(Node head1, Node head2) {
	if (head1 == null || head2 == null)
	    return null;

	int list1Length = getLength(head1);
	int list2Length = getLength(head2);

	int diff = Math.abs(list1Length - list2Length);

	Node big = list1Length > list2Length ? head1 : head2;
	Node small = list1Length > list2Length ? head2 : head1;

	while (diff != 0) {
	    big = big.next;
	    diff--;
	}

	while (big != null && small != null && big != small) {
	    big = big.next;
	    small = small.next;
	}

	if (big == null || small == null)
	    return null;

	return big;
    }

    private int getLength(Node head) {
	int n = 0;

	while (head != null) {
	    head = head.next;
	    n++;
	}
	return n;
    }
}
package algorithim.linkedlist;

public class LinkedListFlatten {

    class Node {
	int val;
	Node next;
	Node down;

	public Node(int val) {
	    this.val = val;
	}
    }

    LinkedListFlatten.Node head;

    public Node flatten(Node head) {

	if (head == null || head.next == null)
	    return head;

	Node tail = flatten(head.next);

	tail.next = null;

	Node sortedMerge = sortedMerge(head, tail);
	return sortedMerge;
    }

    private Node sortedMerge(Node head1, Node head2) {

	Node head = null, ptr = null;
	Node temp = null;
	while (head1 != null && head2 != null) {

	    if (head1.val <= head2.val) {
		temp = head1;
		head1 = head1.down;
		temp.down = null;
	    } else {
		temp = head2;
		head2 = head2.down;
		temp.down = null;
	    }

	    if (head == null)
		head = ptr = temp;
	    else {
		ptr.down = temp;
		ptr = ptr.down;
	    }

	}

	if (head1 != null)
	    ptr.down = head1;
	else if (head2 != null)
	    ptr.down = head2;

	return head;
    }

}

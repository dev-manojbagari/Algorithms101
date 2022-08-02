package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListAddTwoNumbers {

    LinkedList.Node head, head1, head2;

    // 4 5
    // 3 4 5
    public Node add(Node head1, Node head2) {

	if (head1 == null)
	    return head2;
	if (head2 == null)
	    return null;

	head1 = reverse(head1);
	head2 = reverse(head2);

	Node ptr1 = head1;
	Node ptr2 = head2;
	Node dummy = new Node(-1);
	Node ptr = dummy;
	int sum = 0, carry = 0;
	while (ptr1 != null || ptr2 != null) {

	    if (ptr1 != null && ptr2 != null) {
		sum = (carry + ptr1.val + ptr2.val) % 10;
		carry = (carry + ptr1.val + ptr2.val) / 10;

		ptr1 = ptr1.next;
		ptr2 = ptr2.next;

	    } else if (ptr1 != null) {
		sum = carry + ptr1.val % 10;
		carry = carry + ptr1.val / 10;
		ptr1 = ptr1.next;

	    } else {
		sum = carry + ptr2.val % 10;
		carry = carry + ptr2.val / 10;
		ptr2 = ptr2.next;

	    }

	    Node temp = new Node(sum);
	    ptr.next = temp;
	    ptr = ptr.next;

	}
	if (carry != 0)
	    ptr.next = new Node(carry);

	return reverse(dummy.next);
    }

    private Node reverse(Node head) {
	Node prev = null, curr = head, next = null;

	while (curr != null) {
	    next = curr.next;
	    curr.next = prev;
	    prev = curr;
	    curr = next;

	}

	return prev;
    }

}

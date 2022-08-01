package algorithim.linkedlist;

import java.util.HashSet;
import java.util.Set;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListCommonElementInTwoUnSortedList {

    LinkedList.Node head, tail, head1, head2;

    // o(nlogn) + constant space
    public Node getCommonElem(Node head1, Node head2) {

	if (head1 == null || head2 == null)
	    return null;

	LinkedListMergeSortRecursive mergeSort = new LinkedListMergeSortRecursive();
	head1 = mergeSort.sortList(head1);
	head2 = mergeSort.sortList(head2);

	Node ptr = null, ptr1 = head1, ptr2 = head2;
	Node tempHead = null;
	while (ptr1 != null && ptr2 != null) {
	    if (ptr1.val == ptr2.val) {
		if (tempHead == null)
		    tempHead = ptr = new Node(ptr1.val);
		else {
		    ptr.next = new Node(ptr1.val);
		    ptr = ptr.next;
		}

		ptr1 = ptr1.next;
		ptr2 = ptr2.next;

	    } else if (ptr1.val < ptr2.val) {
		ptr1 = ptr1.next;
	    } else {
		ptr2 = ptr2.next;
	    }
	}

	return tempHead;

    }

    // o(n) + o(n)
    public Node getCommonElem2(Node head1, Node head2) {

	if (head1 == null || head2 == null)
	    return null;

	Set<Integer> set = new HashSet<Integer>();

	for (Node ptr1 = head1; ptr1 != null; ptr1 = ptr1.next) {
	    set.add(ptr1.val);
	}

	Node newHead = null, ptr = null;
	for (Node ptr2 = head2; ptr2 != null; ptr2 = ptr2.next) {
	    if (set.contains(ptr2.val)) {
		if (newHead == null)
		    newHead = ptr = new Node(ptr2.val);
		else {
		    ptr.next = new Node(ptr2.val);
		    ptr = ptr.next;
		}

	    }
	}

	return newHead;

    }

}
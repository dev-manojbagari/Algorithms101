package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListQuickSort {

    LinkedList.Node head, tail;

    public Node quickSort(Node head) {

	if (head == null || head.next == null)
	    return head;

	quickSort(head, null);

	return head;
    }

    private void quickSort(Node start, Node end) {

	if (start != end) {
	    Node pivot = partition(start, end);
	    quickSort(start, pivot);
	    quickSort(pivot.next, end);
	}
    }

    private Node partition(Node start, Node end) {

	int pivot = start.val;

	Node curr = start;
	Node ptr = start.next;

	while (ptr != end) {
	    if (ptr.val < pivot) {
		curr = curr.next;
		swapValue(curr, ptr);
	    }
	    ptr = ptr.next;
	}

	swapValue(start, curr);

	return curr;
    }

    private void swapValue(Node curr, Node ptr) {
	int temp = curr.val;
	curr.val = ptr.val;
	ptr.val = temp;
    }

}

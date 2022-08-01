package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListQuickSort {

    LinkedList.Node head, tail;

    public Node quickSort(Node head) {
	if (head == null || head.next == null)
	    return head;

	Node tail = head;
	while (tail.next != null)
	    tail = tail.next;

	quickSort(head, tail);
	return head;
    }

    private void quickSort(Node head, Node tail) {

	if (head == null || tail == null || tail == head || tail.next == head)
	    return;

	Node pivotPrev = pivot(head, tail);

	if (pivotPrev != null)
	    quickSort(head, pivotPrev);

	if (pivotPrev != null && pivotPrev == head)
	    quickSort(pivotPrev.next, tail);
	else if (pivotPrev != null && pivotPrev.next != null && pivotPrev.next.next != null)
	    quickSort(pivotPrev.next.next, tail);

	return;
    }

    private Node pivot(Node head, Node tail) {

	Node start = head;
	int pivot = tail.val;
	Node prev = head;

	Node ptr = head;

	while (ptr != tail.next) {
	    if (ptr.val < pivot) {
		int temp = ptr.val;
		ptr.val = start.val;
		start.val = temp;
		prev = start;
		start = start.next;
	    }
	    ptr = ptr.next;
	}

	int temp = tail.val;
	tail.val = start.val;
	start.val = temp;

	return prev;
    }

}

package algorithim.linkedlist;

import java.util.HashSet;
import java.util.Set;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListRemoveDupInUnSortedList {

    LinkedList.Node head, tail;

    public void removeDup() {

	if (head == null || head.next == null)
	    return;

	Node temp = head;
	while (temp != null) {
	    Node prev = temp;
	    Node curr = temp.next;
	    while (curr != null) {
		if (curr.val == temp.val) {
		    prev.next = curr.next;
		    curr.next = null;
		    curr = prev.next;
		} else {
		    prev = curr;
		    curr = curr.next;
		}
	    }
	    temp = temp.next;

	}

    }

    public void removeDup2() {

	if (head == null || head.next == null)
	    return;

	Set<Integer> set = new HashSet<>();

	set.add(head.val);
	Node prev = head;
	Node curr = head.next;

	while (curr != null) {
	    if (set.contains(curr.val)) {
		prev.next = curr.next;
		curr.next = null;
		curr = prev.next;
	    } else {
		set.add(curr.val);
		prev = curr;
		curr = curr.next;
	    }

	}

    }

}

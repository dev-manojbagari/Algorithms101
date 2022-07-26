package algorithim.linkedlist;

import algorithim.linkedlist.LinkedList.Node;

public class LLUtil {

    public static Node convert(String str) {

	String[] split = str.split(" ");

	LinkedList list = new LinkedList();
	for (int i = 0; i < split.length; i++) {
	    Node node = new LinkedList.Node(Integer.parseInt(split[i].trim()));
	    if (list.head == null) {
		list.head = list.tail = node;
	    } else {
		list.tail.next = node;
		list.tail = node;

	    }
	}

	return list.head;
    }

    public static String convert(Node head) {

	StringBuilder sb = new StringBuilder();

	Node curr = head;
	while (curr != null) {
	    sb.append(curr.val + " ");
	    curr = curr.next;
	}

	return sb.toString().trim();
    }

}

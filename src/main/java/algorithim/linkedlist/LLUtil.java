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

}

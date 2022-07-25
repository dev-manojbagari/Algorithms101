package algorithim.linkedlist;

public class LLUtil {

    public static LinkedList convert(String str) {

	String[] split = str.split(" ");

	LinkedList list = new LinkedList();
	for (int i = 0; i < split.length; i++) {
	    LinkedList node = new LinkedList(Integer.parseInt(split[i].trim()));
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

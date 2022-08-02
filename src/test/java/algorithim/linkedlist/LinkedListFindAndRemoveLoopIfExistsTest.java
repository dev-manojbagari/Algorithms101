package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListFindAndRemoveLoopIfExistsTest {

    LinkedListFindAndRemoveLoopIfExists list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListFindAndRemoveLoopIfExists();
    }

    @Test
    public void test() {
	list.head = new Node(1);
	list.head.next = new Node(2);
	list.head.next.next = new Node(3);
	list.head.next.next.next = new Node(4);
	list.head.next.next.next.next = new Node(5);
	list.head.next.next.next.next.next = list.head.next.next;

	list.head = list.findAndRemoveLoop(list.head);

	assertEquals("1 2 3 4 5", LLUtil.convert(list.head));

    }

}

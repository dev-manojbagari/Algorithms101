package algorithim.linkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListLoopCheckTest {

    LinkedListLoopCheck list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListLoopCheck();
    }

    @Test
    public void test() {
	list.head = new Node(1);
	list.head.next = new Node(2);
	list.head.next.next = new Node(3);
	list.head.next.next.next = new Node(4);
	list.head.next.next.next.next = new Node(5);
	list.head.next.next.next.next.next = list.head.next.next;

	assertTrue(list.hasCycle(list.head));

    }

}

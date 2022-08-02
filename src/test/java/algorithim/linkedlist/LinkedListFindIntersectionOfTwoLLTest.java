package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import algorithim.linkedlist.LinkedList.Node;

public class LinkedListFindIntersectionOfTwoLLTest {

    LinkedListFindIntersectionOfTwoLL list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListFindIntersectionOfTwoLL();
    }

    @Test
    public void test() {
	list.head1 = LLUtil.convert("63");
	list.head2 = LLUtil.convert("65");

	Node node = new Node(50);

	list.head1.next = node;
	list.head2.next = node;

	LinkedList.Node ip = list.intersectionPoint(list.head1, list.head2);

	assertEquals(50, ip.val);

    }

}

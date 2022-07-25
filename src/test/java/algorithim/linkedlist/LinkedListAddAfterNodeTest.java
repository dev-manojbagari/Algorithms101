package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class LinkedListAddAfterNodeTest {

    LinkedListAddAfterNode list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListAddAfterNode();
    }

    @Test
    public void test() {

	list.head = LLUtil.convert("1 2 4 5");
	list.addAfterNode(list.head.next, 3);

	assertEquals(1, list.head.val);
	assertEquals(2, list.head.next.val);
	assertEquals(3, list.head.next.next.val);
	assertEquals(4, list.head.next.next.next.val);
	assertEquals(5, list.head.next.next.next.next.val);
	assertNull(list.head.next.next.next.next.next);

    }

}

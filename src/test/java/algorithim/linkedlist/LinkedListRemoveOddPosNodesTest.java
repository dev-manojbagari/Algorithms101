package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveOddPosNodesTest {

    LinkedListRemoveOddPosNodes list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveOddPosNodes();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 3 4 5 6");

	list.removeAllOddPos();

	assertEquals(2, list.head.val);
	assertEquals(4, list.head.next.val);
	assertEquals(6, list.head.next.next.val);
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1");

	list.removeAllOddPos();

	assertNull(list.head);
    }

}

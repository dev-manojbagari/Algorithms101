package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveGivenNodeTest {

    LinkedListRemoveGivenNode list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveGivenNode();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 3 4 5");

	list.remove(list.head.next);

	assertEquals(1, list.head.val);
	assertEquals(3, list.head.next.val);
	assertEquals(4, list.head.next.next.val);
	assertEquals(5, list.head.next.next.next.val);
	assertNull(list.head.next.next.next.next);

    }

}

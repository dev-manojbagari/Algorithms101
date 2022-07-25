package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveNodeWithGivenValueTest {

    LinkedListRemoveNodeWithGivenValue list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveNodeWithGivenValue();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 4 5");

	list.remove(2);

	assertEquals(1, list.head.val);
	assertEquals(4, list.head.next.val);
	assertEquals(5, list.head.next.next.val);
	assertNull(list.head.next.next.next);
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1 2 4 5");

	list.remove(1);

	assertEquals(2, list.head.val);
	assertEquals(4, list.head.next.val);
	assertEquals(5, list.head.next.next.val);
	assertNull(list.head.next.next.next);
    }

}

package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveAllEvenValueNodesTest {

    LinkedListRemoveAllEvenValueNodes list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveAllEvenValueNodes();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 3 2 5 4");

	list.removeAllEvenValueNodes();

	assertEquals(1, list.head.val);
	assertEquals(3, list.head.next.val);
	assertEquals(5, list.head.next.next.val);
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("2");

	list.removeAllEvenValueNodes();

	assertNull(list.head);
    }
}

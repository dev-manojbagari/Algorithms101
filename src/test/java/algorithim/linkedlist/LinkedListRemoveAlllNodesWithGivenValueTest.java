package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveAlllNodesWithGivenValueTest {
    LinkedListRemoveAlllNodesWithGivenValue list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveAlllNodesWithGivenValue();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 2 2 4 2 5");

	list.removeAll(2);

	assertEquals(1, list.head.val);
	assertEquals(4, list.head.next.val);
	assertEquals(5, list.head.next.next.val);

    }

}

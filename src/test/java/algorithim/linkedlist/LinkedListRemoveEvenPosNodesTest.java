package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveEvenPosNodesTest {

    LinkedListRemoveEvenPosNodes list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveEvenPosNodes();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 3 4 5");

	list.removeAllEvenPos();

	assertEquals(1, list.head.val);
	assertEquals(3, list.head.next.val);
	assertEquals(5, list.head.next.next.val);
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1");

	list.removeAllEvenPos();

	assertEquals(1, list.head.val);
    }

}

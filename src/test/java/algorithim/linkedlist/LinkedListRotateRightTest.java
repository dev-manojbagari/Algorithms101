package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRotateRightTest {

    LinkedListRotateRight list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRotateRight();
    }

    @Test
    public void test() {

	list.head = LLUtil.convert("1 2 3 4 5");
	list.head = list.rotate(list.head, 2);
	assertEquals("4 5 1 2 3", LLUtil.convert(list.head));

    }

    // 1 2 3 -1
    @Test
    public void test2() {

	list.head = LLUtil.convert("1 2 3");
	list.head = list.rotate(list.head, 4);
	assertEquals("3 1 2", LLUtil.convert(list.head));

    }

    // 1 2 3 4 5 6

    @Test
    public void test3() {

	list.head = LLUtil.convert("1 2 3 4 5 6");
	list.head = list.rotate(list.head, 2);
	assertEquals("5 6 1 2 3 4", LLUtil.convert(list.head));

    }

}

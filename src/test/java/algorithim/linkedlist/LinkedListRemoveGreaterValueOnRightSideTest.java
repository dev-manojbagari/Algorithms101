package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveGreaterValueOnRightSideTest {

    LinkedListRemoveGreaterValueOnRightSide list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveGreaterValueOnRightSide();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("12 15 10 11 5 6 2 3");

	list.removeGreaterRight();

	assertEquals("15 11 6 3", LLUtil.convert(list.head));
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("10 20 30 40 50 60");

	list.removeGreaterRight();

	assertEquals("60", LLUtil.convert(list.head));
    }

    @Test
    public void test3() {
	list.head = LLUtil.convert("60 50 40 30 20 10");

	list.removeGreaterRight();

	assertEquals("60 50 40 30 20 10", LLUtil.convert(list.head));
    }

}

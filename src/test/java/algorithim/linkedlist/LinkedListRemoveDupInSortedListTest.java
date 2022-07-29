package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveDupInSortedListTest {

    LinkedListRemoveDupInSortedList list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveDupInSortedList();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 1 2 3 4 5 5");

	list.removeDup();

	assertEquals("1 2 3 4 5", LLUtil.convert(list.head).trim());

    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1 1 1");

	list.removeDup();

	assertEquals("1", LLUtil.convert(list.head));

    }

    @Test
    public void test3() {
	list.head = LLUtil.convert("1 2 3");

	list.removeDup();

	assertEquals("1 2 3", LLUtil.convert(list.head));

    }

}

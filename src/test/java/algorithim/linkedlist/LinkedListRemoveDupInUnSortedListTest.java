package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveDupInUnSortedListTest {

    LinkedListRemoveDupInUnSortedList list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveDupInUnSortedList();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 2 3 5 4 5");

	list.removeDup2();

	assertEquals("1 2 3 5 4", LLUtil.convert(list.head).trim());

    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1 1 1");

	list.removeDup2();

	assertEquals("1", LLUtil.convert(list.head));

    }

    @Test
    public void test3() {
	list.head = LLUtil.convert("1 2 3 1 2 4");

	list.removeDup2();

	assertEquals("1 2 3 4", LLUtil.convert(list.head));

    }

}

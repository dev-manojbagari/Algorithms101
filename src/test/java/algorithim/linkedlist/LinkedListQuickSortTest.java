package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListQuickSortTest {

    LinkedListQuickSort list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListQuickSort();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("5 3 2 1 4 9 7 8 6");

	list.head = list.quickSort(list.head);

	assertEquals("1 2 3 4 5 6 7 8 9", LLUtil.convert(list.head));

    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("9 8 7 6 5 4 3 2 1");

	list.head = list.quickSort(list.head);

	assertEquals("1 2 3 4 5 6 7 8 9", LLUtil.convert(list.head));

    }

}

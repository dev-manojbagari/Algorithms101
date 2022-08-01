package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListCommonElementInTwoSortedListTest {

    LinkedListCommonElementInTwoSortedList list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListCommonElementInTwoSortedList();
    }

    @Test
    public void test() {

	list.head1 = LLUtil.convert("1 2 3 4 5 6 7");
	list.head2 = LLUtil.convert("5 6 7 8 9 10 11");

	list.head = list.getCommonElem(list.head1, list.head2);

	assertEquals("5 6 7", LLUtil.convert(list.head));

    }

}

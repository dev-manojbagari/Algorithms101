package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListCommonElementInTwoUnSortedListTest {

    LinkedListCommonElementInTwoUnSortedList list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListCommonElementInTwoUnSortedList();
    }

    @Test
    public void test() {

	list.head1 = LLUtil.convert("1 2 5 6 7 3 4");
	list.head2 = LLUtil.convert("10 5 11 6 7 8 9 10 11");

	list.head = list.getCommonElem(list.head1, list.head2);

	assertEquals("5 6 7", LLUtil.convert(list.head));

    }

}

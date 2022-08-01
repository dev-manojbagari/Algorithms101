package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListMergeSortIterativeTest {

    LinkedListMergeSortIterative list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListMergeSortIterative();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 3 2 5 4 9 7 8 6");

	list.head = list.sortList(list.head);

	assertEquals("1 2 3 4 5 6 7 8 9", LLUtil.convert(list.head));

    }

}

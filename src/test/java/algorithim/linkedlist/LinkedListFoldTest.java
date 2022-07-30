package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListFoldTest {

    LinkedListFold list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListFold();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 3 4");

	list.head = list.reorderList(list.head);

	assertEquals("1 4 2 3", LLUtil.convert(list.head));
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1 2 3 4 5");

	list.head = list.reorderList(list.head);

	assertEquals("1 5 2 4 3", LLUtil.convert(list.head));
    }

}

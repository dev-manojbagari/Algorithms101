package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListReverseInGroupsTest {

    LinkedListReverseInGroups list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListReverseInGroups();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 3 4 5");

	list.head = list.reverseInGroup(list.head, 2);

	String convert = LLUtil.convert(list.head);
	assertEquals("2 1 4 3 5", convert);
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1");

	list.head = list.reverseInGroup(list.head, 2);

	assertEquals("1", LLUtil.convert(list.head));
    }

    @Test
    public void test3() {
	list.head = LLUtil.convert("1 2 3 4 5 6 7 8 9");

	list.head = list.reverseInGroup(list.head, 3);

	String convert = LLUtil.convert(list.head);
	assertEquals("3 2 1 6 5 4 9 8 7", convert);
    }

}

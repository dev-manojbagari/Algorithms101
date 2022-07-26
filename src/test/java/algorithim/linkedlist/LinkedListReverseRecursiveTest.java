package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListReverseRecursiveTest {

    LinkedListReverseRecursive list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListReverseRecursive();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 3 4 5");

	list.reverse();

	String convert = LLUtil.convert(list.head);
	assertEquals("5 4 3 2 1", convert);
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1");

	list.reverse();

	assertEquals("1", LLUtil.convert(list.head));
    }

}

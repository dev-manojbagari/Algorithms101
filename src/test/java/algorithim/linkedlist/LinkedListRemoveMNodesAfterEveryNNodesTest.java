package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRemoveMNodesAfterEveryNNodesTest {

    LinkedListRemoveMNodesAfterEveryNNodes list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRemoveMNodesAfterEveryNNodes();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 3 4 5 6 7 8 9");
	list.removeMafterN(list.head, 2, 2);
	String str = LLUtil.convert(list.head);
	assertEquals("1 2 5 6 9", str);
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1 2 3 4 5 6 7 8 9 10 11 12");
	list.removeMafterN(list.head, 3, 3);
	String str = LLUtil.convert(list.head);
	assertEquals("1 2 3 7 8 9", str);
    }

    @Test
    public void test3() {
	list.head = LLUtil.convert("1 2 3 4 5 6 7 8 9 10 11 12");
	list.removeMafterN(list.head, 4, 2);
	String str = LLUtil.convert(list.head);
	assertEquals("1 2 3 4 7 8 9 10", str);
    }

}

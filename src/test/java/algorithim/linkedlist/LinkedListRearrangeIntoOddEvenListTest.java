package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRearrangeIntoOddEvenListTest {
    LinkedListRearrangeIntoOddEvenList list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRearrangeIntoOddEvenList();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 3 2 5 4 6");

	list.rearrangeOddEven();

	assertEquals(1, list.head.val);
	assertEquals(3, list.head.next.val);
	assertEquals(5, list.head.next.next.val);
	assertEquals(2, list.head.next.next.next.val);
	assertEquals(4, list.head.next.next.next.next.val);
	assertEquals(6, list.head.next.next.next.next.next.val);
    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("2 1");

	list.rearrangeOddEven();

	assertEquals(1, list.head.val);
	assertEquals(2, list.head.next.val);
    }

    @Test
    public void test3() {
	list.head = LLUtil.convert("2");

	list.rearrangeOddEven();

	assertEquals(2, list.head.val);
    }

}

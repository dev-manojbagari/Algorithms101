package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class LinkedListSplitOddEvenValuesTest {
    LinkedListSplitOddEvenValues list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListSplitOddEvenValues();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 3 4 5 6");

	list.splitOddEvenValues();

	assertEquals(1, list.head1.val);
	assertEquals(3, list.head1.next.val);
	assertEquals(5, list.head1.next.next.val);
	assertNull(list.head1.next.next.next);

	assertEquals(2, list.head2.val);
	assertEquals(4, list.head2.next.val);
	assertEquals(6, list.head2.next.next.val);
	assertNull(list.head2.next.next.next);

    }

    @Test
    public void test2() {
	list.head = LLUtil.convert("1");

	list.splitOddEvenValues();

	assertEquals(1, list.head1.val);

	assertNull(list.head1.next);

	assertNull(list.head2);

    }
}

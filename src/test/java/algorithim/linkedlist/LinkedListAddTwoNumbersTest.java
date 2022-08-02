package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListAddTwoNumbersTest {

    LinkedListAddTwoNumbers list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListAddTwoNumbers();
    }

    @Test
    public void test() {

	list.head1 = LLUtil.convert("4 5");
	list.head2 = LLUtil.convert("3 4 5");

	list.head = list.add(list.head1, list.head2);

	assertEquals("3 9 0", LLUtil.convert(list.head));

    }

}

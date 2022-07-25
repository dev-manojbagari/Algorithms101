package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class LinkedListAddLastTest {

    LinkedListAddLast list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListAddLast();
    }

    @Test
    public void test() {

	assertNull(list.head);
	list.addLast(3);
	list.addLast(2);
	list.addLast(1);

	assertEquals(3, list.head.val);
	assertEquals(2, list.head.next.val);
	assertEquals(1, list.head.next.next.val);

    }

}

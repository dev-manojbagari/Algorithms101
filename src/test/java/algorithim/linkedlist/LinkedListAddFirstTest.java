package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class LinkedListAddFirstTest {

    LinkedListAddFirst list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListAddFirst();
    }

    @Test
    public void test() {

	assertNull(list.head);
	list.addFirst(3);
	list.addFirst(2);
	list.addFirst(1);

	assertEquals(1, list.head.val);
	assertEquals(2, list.head.next.val);
	assertEquals(3, list.head.next.next.val);

    }

}

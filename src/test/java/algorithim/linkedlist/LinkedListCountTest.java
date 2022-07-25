package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListCountTest {

    LinkedListCount list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListCount();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 2 2 4 5 5 5 5 5");

	assertEquals(3, list.count(2));
	assertEquals(1, list.count(4));
	assertEquals(5, list.count(5));

    }

}

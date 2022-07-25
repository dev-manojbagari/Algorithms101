package algorithim.linkedlist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LinkedListSearchTest {

    LinkedListSearch list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListSearch();
    }

    @Test
    public void test() {
	list.head = LLUtil.convert("1 2 4 5");

	assertTrue(list.find(1));
	assertTrue(list.find(2));
	assertFalse(list.find(3));
	assertTrue(list.find(4));
	assertTrue(list.find(5));

    }

}

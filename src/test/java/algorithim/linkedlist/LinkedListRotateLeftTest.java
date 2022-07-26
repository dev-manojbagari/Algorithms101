package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListRotateLeftTest {

    LinkedListRotateLeft list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListRotateLeft();
    }

    @Test
    public void test() {

	list.head = LLUtil.convert("1 2 3 4 5");
	list.rotateLeft(7);
	assertEquals("3 4 5 1 2", LLUtil.convert(list.head));

    }

}

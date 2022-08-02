package algorithim.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListFlattenTest {

    LinkedListFlatten list;

    @Before
    public void setUp() throws Exception {
	list = new LinkedListFlatten();
    }

    /*
     * 5 -> 10 -> 19 -> 28 | | | | 7 20 22 35 | | | 8 50 40 | | 30 45
     * 
     */

    @Test
    public void test() {
	list.head = list.new Node(5);
	list.head.down = list.new Node(7);
	list.head.down.down = list.new Node(8);
	list.head.down.down.down = list.new Node(30);

	list.head.next = list.new Node(10);
	list.head.next.down = list.new Node(20);

	list.head.next.next = list.new Node(19);
	list.head.next.next.down = list.new Node(22);
	list.head.next.next.down.down = list.new Node(50);

	list.head.next.next.next = list.new Node(28);
	list.head.next.next.next.down = list.new Node(35);
	list.head.next.next.next.down.down = list.new Node(40);
	list.head.next.next.next.down.down.down = list.new Node(45);

	list.head = list.flatten(list.head);
//	 5-> 7-> 8- > 10 -> 19-> 20->
//	 22-> 28-> 30-> 35-> 40-> 45-> 50.

	assertEquals(5, list.head.val);
	assertEquals(7, list.head.down.val);
	assertEquals(8, list.head.down.down.val);
	assertEquals(10, list.head.down.down.down.val);
	assertEquals(19, list.head.down.down.down.down.val);
	assertEquals(20, list.head.down.down.down.down.down.val);
	assertEquals(22, list.head.down.down.down.down.down.down.val);
	assertEquals(28, list.head.down.down.down.down.down.down.down.val);
	assertEquals(30, list.head.down.down.down.down.down.down.down.down.val);
	assertEquals(35, list.head.down.down.down.down.down.down.down.down.down.val);
	assertEquals(40, list.head.down.down.down.down.down.down.down.down.down.down.val);
	assertEquals(45, list.head.down.down.down.down.down.down.down.down.down.down.down.val);
	assertEquals(50, list.head.down.down.down.down.down.down.down.down.down.down.down.down.val);
    }

}

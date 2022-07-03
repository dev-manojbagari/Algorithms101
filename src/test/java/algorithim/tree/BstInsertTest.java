package algorithim.tree;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BstInsertTest {

	BSTInsert bst;

	@Before
	public void setUp() throws Exception {
		bst = new BSTInsert();
	}

	@Test
	public void testBstInsertIterative() {

		bst.root = bst.insertIterative(bst.root, 8);

		bst.root = bst.insertIterative(bst.root, 4);
		bst.root = bst.insertIterative(bst.root, 2);
		bst.root = bst.insertIterative(bst.root, 6);

		bst.root = bst.insertIterative(bst.root, 12);
		bst.root = bst.insertIterative(bst.root, 10);
		bst.root = bst.insertIterative(bst.root, 14);

		assertEquals(bst.root.value, 8);

		assertEquals(bst.root.left.value, 4);
		assertEquals(bst.root.left.left.value, 2);
		assertEquals(bst.root.left.right.value, 6);

		assertEquals(bst.root.right.value, 12);
		assertEquals(bst.root.right.left.value, 10);
		assertEquals(bst.root.right.right.value,14);
		
		bst.root=null;

	}

	
	@Test
	public void testBstInsertRecurisve() {

		bst.root = bst.insertRecursive(bst.root, 8);

		bst.root = bst.insertRecursive(bst.root, 4);
		bst.root = bst.insertRecursive(bst.root, 2);
		bst.root = bst.insertRecursive(bst.root, 6);

		bst.root = bst.insertRecursive(bst.root, 12);
		bst.root = bst.insertRecursive(bst.root, 10);
		bst.root = bst.insertRecursive(bst.root, 14);

		assertEquals(bst.root.value, 8);

		assertEquals(bst.root.left.value, 4);
		assertEquals(bst.root.left.left.value, 2);
		assertEquals(bst.root.left.right.value, 6);

		assertEquals(bst.root.right.value, 12);
		assertEquals(bst.root.right.left.value, 10);
		assertEquals(bst.root.right.right.value,14);

	}
	
	
}

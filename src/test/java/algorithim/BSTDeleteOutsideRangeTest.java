package algorithim;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BSTDeleteOutsideRangeTest {

	BSTDeleteOutsideRange bst;

	@Before
	public void setUp() throws Exception {
		bst = new BSTDeleteOutsideRange();

	}

	@Test
	public void bstDeleteOutsideRangeTest() {

		bst.root = new TreeNode(6);
		bst.root.left = new TreeNode(-13);
		bst.root.left.right = new TreeNode(-8);

		bst.root.right = new TreeNode(14);
		bst.root.right.left = new TreeNode(13);
		bst.root.right.right = new TreeNode(15);
		bst.root.right.left.left = new TreeNode(7);

		bst.bstDeleteOutsideRange(bst.root, -10, 13);
		
		
		assertEquals(6, bst.root.value);
		assertEquals(-8, bst.root.left.value);
		assertEquals(13, bst.root.right.value);
		assertEquals(7, bst.root.right.left.value);
		assertNull(bst.root.right.right);
	}

}

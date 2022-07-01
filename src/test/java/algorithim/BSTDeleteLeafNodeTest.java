package algorithim;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BSTDeleteLeafNodeTest {

    BSTDeleteLeafNode bst;

    @Before
    public void setUp() throws Exception {
	bst = new BSTDeleteLeafNode();
    }

    @Test
    public void bstDeleteInsideRangeTest() {

	bst.root = new TreeNode(20);
	bst.root.left = new TreeNode(10);
	bst.root.left.left = new TreeNode(5);
	bst.root.left.right = new TreeNode(15);

	bst.root.right = new TreeNode(30);
	bst.root.right.left = new TreeNode(25);
	bst.root.right.right = new TreeNode(35);

	bst.bstDeleteLeafNode(bst.root);

	assertNull(bst.root.left.left);
	assertNull(bst.root.left.right);

	assertNull(bst.root.right.left);
	assertNull(bst.root.right.right);

	assertEquals(bst.root.left.value, 10);
	assertEquals(bst.root.right.value, 30);

    }

}

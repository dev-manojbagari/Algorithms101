package algorithim.tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BSTKthSmallestKthLargestTest {

    BSTKthSmallestKthLargest bst;

    @Before
    public void setUp() throws Exception {
	bst = new BSTKthSmallestKthLargest();

    }

    @Test
    public void bstKthSmallestTest() {

	bst.root = new TreeNode(50);
	bst.root.left = new TreeNode(30);
	bst.root.left.left = new TreeNode(20);
	bst.root.left.right = new TreeNode(40);

	bst.root.right = new TreeNode(70);
	bst.root.right.left = new TreeNode(60);
	bst.root.right.right = new TreeNode(80);

	assertEquals(40, bst.bstKthSmallest(bst.root, 3).value);
	assertEquals(80, bst.bstKthSmallest(bst.root, 7).value);
	assertNull(bst.bstKthSmallest(bst.root, 8));

    }

    @Test
    public void bstKthLargestTest() {

	bst.root = new TreeNode(50);
	bst.root.left = new TreeNode(30);
	bst.root.left.left = new TreeNode(20);
	bst.root.left.right = new TreeNode(40);

	bst.root.right = new TreeNode(70);
	bst.root.right.left = new TreeNode(60);
	bst.root.right.right = new TreeNode(80);

	assertEquals(60, bst.bstKthLargest(bst.root, 3).value);
	assertEquals(20, bst.bstKthLargest(bst.root, 7).value);
	assertNull(bst.bstKthLargest(bst.root, 8));

    }
}
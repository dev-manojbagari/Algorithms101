package algorithim.tree;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BSTDeadEndTest {

    BSTDeadEnd bst;

    @Before
    public void setUp() throws Exception {
	bst = new BSTDeadEnd();
    }

    @Test
    public void test() {

	bst.root = new TreeNode(8);
	bst.root.left = new TreeNode(5);
	bst.root.right = new TreeNode(9);

	bst.root.left.left = new TreeNode(2);
	bst.root.left.right = new TreeNode(7);

	bst.root.left.left.left = new TreeNode(1);

	bst.root.right = new TreeNode(9);

	assertTrue(bst.deadEnd(bst.root));

    }

    @Test
    public void test2() {

	bst.root = new TreeNode(8);
	bst.root.left = new TreeNode(7);
	bst.root.left.left = new TreeNode(2);

	bst.root.right = new TreeNode(10);
	bst.root.right.left = new TreeNode(9);
	bst.root.right.right = new TreeNode(13);

	assertTrue(bst.deadEnd(bst.root));

    }

    @Test
    public void test3() {

	bst.root = new TreeNode(5);
	bst.root.left = new TreeNode(4);
	bst.root.left.left = new TreeNode(3);
	bst.root.left.left.left = new TreeNode(3);
	bst.root.left.left.left.left = new TreeNode(1);

	bst.root.right = new TreeNode(6);
	bst.root.right.right = new TreeNode(72);
	bst.root.right.right.left = new TreeNode(8);

	assertTrue(bst.deadEnd(bst.root));

    }

}
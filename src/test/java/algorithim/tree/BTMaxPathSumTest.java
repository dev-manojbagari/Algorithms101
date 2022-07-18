package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTMaxPathSumTest {

    BTMaxPathSum bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTMaxPathSum();
    }

    @Test
    public void test() {
	bt.root = new TreeNode(-10);
	bt.root.left = new TreeNode(9);
	bt.root.left.left = new TreeNode(34);
	bt.root.right = new TreeNode(-20);
	bt.root.right.left = new TreeNode(-15);
	bt.root.right.right = new TreeNode(-7);

	assertEquals(43, bt.maxPathSum(bt.root));
    }

    @Test
    public void test2() {
	bt.root = new TreeNode(5);
	bt.root.left = new TreeNode(4);
	bt.root.right = new TreeNode(8);
	bt.root.left.left = new TreeNode(11);
	bt.root.left.left.left = new TreeNode(7);
	bt.root.left.left.right = new TreeNode(2);
	bt.root.right.left = new TreeNode(13);
	bt.root.right.left.right = new TreeNode(1);
	bt.root.right.right = new TreeNode(4);

	assertEquals(49, bt.maxPathSum(bt.root));
    }

    @Test
    public void test3() {
	bt.root = new TreeNode(-1);
	bt.root.left = new TreeNode(-2);

	assertEquals(-1, bt.maxPathSum(bt.root));
    }

}

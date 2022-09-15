package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTIsChildSumTreeTest {

    BTIsChildSumTree bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTIsChildSumTree();
    }

    @Test
    public void test() {
	bt.root = new TreeNode(10);
	bt.root.left = new TreeNode(8);
	bt.root.right = new TreeNode(2);

	bt.root.left.left = new TreeNode(3);
	bt.root.left.right = new TreeNode(5);

	bt.root.right.left = new TreeNode(2);

	assertTrue(bt.isChildSumTree(bt.root));

    }

    @Test
    public void test2() {
	bt.root = new TreeNode(10);
	bt.root.left = new TreeNode(8);
	bt.root.right = new TreeNode(2);

	bt.root.left.left = new TreeNode(3);
	bt.root.left.right = new TreeNode(5);

	bt.root.right.left = new TreeNode(20);

	assertFalse(bt.isChildSumTree(bt.root));

    }

    @Test
    public void test3() {
	bt.root = BTUtil.convert("10 4 6 -1 -1 -1 -1");

	assertTrue(bt.isChildSumTree(bt.root));

    }

}

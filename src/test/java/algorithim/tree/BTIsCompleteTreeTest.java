package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTIsCompleteTreeTest {

    BTIsCompleteTree bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTIsCompleteTree();
    }

    @Test
    public void isCompleteTree() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);

	assertTrue(bt.isCompleteTree(bt.root));

	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);

	assertFalse(bt.isCompleteTree(bt.root));

    }

}

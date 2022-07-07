package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTHeightTest {

    BTHeight bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTHeight();

    }

    @Test
    public void btHeightTest() {

	bt.root = new TreeNode(50);
	bt.root.left = new TreeNode(30);
	bt.root.left.left = new TreeNode(20);
	bt.root.left.right = new TreeNode(40);

	bt.root.right = new TreeNode(70);
	bt.root.right.left = new TreeNode(60);
	bt.root.right.right = new TreeNode(80);

	assertEquals(3, bt.btHeightRecusive(bt.root));
    }

    @Test
    public void btHeightIterativeTest() {

	bt.root = new TreeNode(50);
	bt.root.left = new TreeNode(30);
	bt.root.left.left = new TreeNode(20);
	bt.root.left.right = new TreeNode(40);

	bt.root.right = new TreeNode(70);
	bt.root.right.left = new TreeNode(60);
	bt.root.right.right = new TreeNode(80);

	assertEquals(3, bt.btHeightIterative(bt.root));
    }
}

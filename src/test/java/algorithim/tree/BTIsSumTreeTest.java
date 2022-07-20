package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTIsSumTreeTest {

    BTIsSumTree bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTIsSumTree();
    }

    @Test
    public void test() {

	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);

	assertFalse(bt.isSumTree(bt.root));
    }

    @Test
    public void tes2() {

	bt.root = new TreeNode(44);
	bt.root.left = new TreeNode(9);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(13);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);

	assertTrue(bt.isSumTree(bt.root));
    }

    @Test
    public void test3() {
	String str = "3 -1 1 2 -1 -1 -1";

	bt.root = BTLeetCodeArrayFormatToBT.codeNinjaConvert(str);

	assertFalse(bt.isSumTree(bt.root));
    }

}

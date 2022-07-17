package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTAreIdenticalTest {

    BTAreIdentical bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTAreIdentical();

    }

    @Test
    public void test1() {

	BTAreIdentical bt1 = new BTAreIdentical();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(2);
	bt1.root.left.left = new TreeNode(4);
	bt1.root.left.right = new TreeNode(5);
	bt1.root.right = new TreeNode(3);
	bt1.root.right.left = new TreeNode(6);
	bt1.root.right.right = new TreeNode(7);

	BTAreIdentical bt2 = new BTAreIdentical();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(2);
	bt2.root.left.left = new TreeNode(4);
	bt2.root.left.right = new TreeNode(5);
	bt2.root.right = new TreeNode(3);
	bt2.root.right.left = new TreeNode(6);
	bt2.root.right.right = new TreeNode(7);

	assertTrue(bt.areIdentical(bt1.root, bt2.root));

    }

    @Test
    public void test2() {

	BTAreIdentical bt1 = new BTAreIdentical();
	bt1.root = new TreeNode(1);
	bt1.root.left = new TreeNode(2);
	bt1.root.left.left = new TreeNode(4);
	bt1.root.left.right = new TreeNode(5);
	bt1.root.right = new TreeNode(3);
	bt1.root.right.left = new TreeNode(6);

	BTAreIdentical bt2 = new BTAreIdentical();
	bt2.root = new TreeNode(1);
	bt2.root.left = new TreeNode(2);
	bt2.root.left.left = new TreeNode(4);
	bt2.root.left.right = new TreeNode(5);
	bt2.root.right = new TreeNode(3);
	bt2.root.right.left = new TreeNode(6);
	bt2.root.right.right = new TreeNode(7);

	assertFalse(bt.areIdentical(bt1.root, bt2.root));

    }

}

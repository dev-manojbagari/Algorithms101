package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BTDiameterTest {

    BTDiameter bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTDiameter();
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

	assertEquals(4, bt.diameter2(bt.root));

    }

    @Test
    public void test2() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	bt.root.right.right.right = new TreeNode(70);

	assertEquals(5, bt.diameter2(bt.root));

    }

    @Test
    public void test3() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);

	assertEquals(1, bt.diameter2(bt.root));

    }
}

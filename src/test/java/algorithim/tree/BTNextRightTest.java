package algorithim.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class BTNextRightTest {

    BTNextRight bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTNextRight();
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

	TreeNode next1 = bt.btNextRight(bt.root, 5);
	assertEquals(next1.value, 6);

	TreeNode next2 = bt.btNextRight(bt.root, 2);
	assertEquals(next2.value, 3);

	TreeNode next3 = bt.btNextRight(bt.root, 7);
	assertNull(next3);

    }

}

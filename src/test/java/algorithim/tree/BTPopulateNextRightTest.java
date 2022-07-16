package algorithim.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class BTPopulateNextRightTest {

    BTPopulateNextRight bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTPopulateNextRight();
    }

//    @Test
//    public void test() {
//
//	bt.root = bt.new TreeNode(1);
//	bt.root.left = bt.new TreeNode(2);
//	bt.root.left.left = bt.new TreeNode(4);
//	bt.root.left.right = bt.new TreeNode(5);
//	bt.root.right = bt.new TreeNode(3);
//	bt.root.right.left = bt.new TreeNode(6);
//	bt.root.right.right = bt.new TreeNode(7);
//
//	bt.btPopulateNextRight2(bt.root);
//	assertEquals(bt.root.left.next.value, 3);
//	assertEquals(bt.root.left.right.next.value, 6);
//	assertEquals(bt.root.right.left.next.value, 7);
//
//	assertNull(bt.root.next);
//
//    }

    @Test
    public void test2() {

	bt.root = bt.new TreeNode(-1);
	bt.root.left = bt.new TreeNode(0);
	bt.root.right = bt.new TreeNode(1);
	bt.root.left.left = bt.new TreeNode(2);
	bt.root.left.right = bt.new TreeNode(3);

	bt.root.right.left = bt.new TreeNode(4);
	bt.root.right.right = bt.new TreeNode(5);

	bt.root.left.left.left = bt.new TreeNode(6);
	bt.root.left.left.right = bt.new TreeNode(7);

	bt.root.left.right.left = bt.new TreeNode(8);
	bt.root.left.right.right = bt.new TreeNode(9);

	bt.root.right.left.left = bt.new TreeNode(10);
	bt.root.right.left.right = bt.new TreeNode(11);

	bt.root.right.right.left = bt.new TreeNode(12);
	bt.root.right.right.right = bt.new TreeNode(13);

	bt.btPopulateNextRight2(bt.root);

	assertEquals(bt.root.left.right.left.next.value, 9);
	assertEquals(bt.root.left.right.right.next.value, 10);

	assertNull(bt.root.next);

    }

}

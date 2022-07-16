package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BTCousionCheckTest {

    BTCousionsCheck bt;;

    @Before
    public void setUp() throws Exception {
	bt = new BTCousionsCheck();
    }

    @Test
    public void areCousionsIter() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	boolean test1 = bt.areCousionsIter(bt.root, 4, 7);
	assertTrue(test1);
	boolean test2 = bt.areCousionsIter(bt.root, 4, 5);
	assertFalse(test2);
	boolean test3 = bt.areCousionsIter(bt.root, 2, 7);
	assertFalse(test3);

    }

}

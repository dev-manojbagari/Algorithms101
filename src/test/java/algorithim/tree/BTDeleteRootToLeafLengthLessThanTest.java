package algorithim.tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BTDeleteRootToLeafLengthLessThanTest {

    BTDeleteRootToLeafLengthLessThan bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTDeleteRootToLeafLengthLessThan();

    }

    @Test
    public void bstDeleteRootToLeafLengthGreaterThanTest() {

	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.left.left.left = new TreeNode(7);

	bt.root.right = new TreeNode(3);
	bt.root.right.right = new TreeNode(6);
	bt.root.right.right.left = new TreeNode(8);
	bt.bstDeleteRootToLeadLengthGreaterThan(bt.root, 4);
	assertNull(bt.root.left.right);
	assertEquals(bt.root.right.right.left.value, 8);

    }

}

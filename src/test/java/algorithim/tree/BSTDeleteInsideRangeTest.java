package algorithim.tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BSTDeleteInsideRangeTest {

    BSTDeleteInsideRange bst;

    @Before
    public void setUp() throws Exception {
	bst = new BSTDeleteInsideRange();

    }

    @Test
    public void bstDeleteInsideRangeTest() {

	bst.root = new TreeNode(50);
	bst.root.left = new TreeNode(30);
	bst.root.left.left = new TreeNode(20);
	bst.root.left.right = new TreeNode(40);

	bst.root.right = new TreeNode(70);
	bst.root.right.left = new TreeNode(60);
	bst.root.right.right = new TreeNode(80);

	bst.root = bst.bstDeleteInsideRange(bst.root, 20, 50);

	assertEquals(70, bst.root.value);
	assertEquals(60, bst.root.left.value);
	assertEquals(80, bst.root.right.value);
    }

}

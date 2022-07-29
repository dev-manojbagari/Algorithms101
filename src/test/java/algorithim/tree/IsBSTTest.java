package algorithim.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class IsBSTTest {

    IsBST bst;

    @Before
    public void setUp() throws Exception {
	bst = new IsBST();

    }

    @Test
    public void isBSTIterativeTest() {

	bst.root = new TreeNode(50);
	bst.root.left = new TreeNode(30);
	bst.root.left.left = new TreeNode(20);
	bst.root.left.right = new TreeNode(40);

	bst.root.right = new TreeNode(70);
	bst.root.right.left = new TreeNode(60);
	bst.root.right.right = new TreeNode(80);

	assertTrue(bst.isBSTIterative(bst.root));
    }

    @Test
    public void isBSTIterativeTest2() {

	bst.root = BTUtil.convert("2,2,2");

	assertFalse(bst.isBSTIterative(bst.root));
    }

    @Test
    public void isBSTRecursiveTest2() {

	bst.root = BTUtil.convert("2,2,2");

	assertFalse(bst.isBSTIterative(bst.root));
    }

    @Test
    public void isBSTRecusiveTest() {

	bst.root = new TreeNode(50);
	bst.root.left = new TreeNode(30);
	bst.root.left.left = new TreeNode(20);
	bst.root.left.right = new TreeNode(40);

	bst.root.right = new TreeNode(70);
	bst.root.right.left = new TreeNode(60);
	bst.root.right.right = new TreeNode(80);

	assertTrue(bst.isBSTRecursive(bst.root));
    }

}

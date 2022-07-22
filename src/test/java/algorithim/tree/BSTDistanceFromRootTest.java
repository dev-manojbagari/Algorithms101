package algorithim.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BSTDistanceFromRootTest {

    BSTDistanceFromRoot bst;

    @Before
    public void setUp() throws Exception {
	bst = new BSTDistanceFromRoot();
    }

    @Test
    public void test() {
	bst.root = new TreeNode(5);
	bst.root.left = new TreeNode(3);
	bst.root.left.left = new TreeNode(2);
	bst.root.left.right = new TreeNode(4);

	bst.root.right = new TreeNode(7);
	bst.root.right.left = new TreeNode(6);
	bst.root.right.right = new TreeNode(8);

	assertEquals(2, bst.distanceFromRoot(bst.root, 2));
	assertEquals(0, bst.distanceFromRoot(bst.root, 5));
	assertEquals(1, bst.distanceFromRoot(bst.root, 7));
    }

}

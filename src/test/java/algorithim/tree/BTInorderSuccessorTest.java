package algorithim.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class BTInorderSuccessorTest {

    BTInorderSuccessor bst;

    @Before
    public void setUp() throws Exception {
	bst = new BTInorderSuccessor();

    }

    @Test
    public void inorderSuccIterativeTest() {

	bst.root = new TreeNode(50);
	bst.root.left = new TreeNode(30);
	bst.root.left.left = new TreeNode(20);
	bst.root.left.right = new TreeNode(40);

	bst.root.right = new TreeNode(70);
	bst.root.right.left = new TreeNode(60);
	bst.root.right.right = new TreeNode(80);

	assertEquals(60, bst.inOrderSuccIter(bst.root, bst.root).value);
	assertEquals(80, bst.inOrderSuccIter(bst.root, bst.root.right).value);
	assertNull(bst.inOrderSuccIter(bst.root, bst.root.right.right));

    }

    @Test
    public void inorderSuccRecursiveTest() {

	bst.root = new TreeNode(50);
	bst.root.left = new TreeNode(30);
	bst.root.left.left = new TreeNode(20);
	bst.root.left.right = new TreeNode(40);

	bst.root.right = new TreeNode(70);
	bst.root.right.left = new TreeNode(60);
	bst.root.right.right = new TreeNode(80);

	assertEquals(60, bst.inOrderSuccRecursive(bst.root, bst.root).value);
	assertEquals(80, bst.inOrderSuccRecursive(bst.root, bst.root.right).value);
	assertNull(bst.inOrderSuccRecursive(bst.root, bst.root.right.right));

    }

}

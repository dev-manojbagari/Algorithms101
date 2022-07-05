package algorithim.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class BSTInorderSuccessorTest {

    BSTInorderSuccessor bst;

    @Before
    public void setUp() throws Exception {
	bst = new BSTInorderSuccessor();

    }

    @Test
    public void inorderSuccWithoutParentPointer() {

	bst.root = new TreeNode(50);
	bst.root.left = new TreeNode(30);
	bst.root.left.left = new TreeNode(20);
	bst.root.left.right = new TreeNode(40);

	bst.root.right = new TreeNode(70);
	bst.root.right.left = new TreeNode(60);
	bst.root.right.right = new TreeNode(80);

	assertEquals(60, bst.inOrderSuccNoParentPointer(bst.root, bst.root).value);
	assertEquals(80, bst.inOrderSuccNoParentPointer(bst.root, bst.root.right).value);
	assertNull(bst.inOrderSuccNoParentPointer(bst.root, bst.root.right.right));

    }

    @Test
    public void inorderSuccWithParentPointer() {

	bst.root2 = bst.new CustomTreeNode(50);
	bst.root2.left = bst.new CustomTreeNode(30);
	bst.root2.left.left = bst.new CustomTreeNode(20);
	bst.root2.left.right = bst.new CustomTreeNode(40);

	bst.root2.right = bst.new CustomTreeNode(70);
	bst.root2.right.left = bst.new CustomTreeNode(60);
	bst.root2.right.right = bst.new CustomTreeNode(80);

	assertEquals(60, bst.inOrderSuccWithParentPointer(bst.root2, bst.root2).value);
	assertEquals(80, bst.inOrderSuccWithParentPointer(bst.root2, bst.root2.right).value);
	assertNull(bst.inOrderSuccWithParentPointer(bst.root2, bst.root2.right.right));

    }

}
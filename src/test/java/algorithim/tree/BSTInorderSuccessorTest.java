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

	assertEquals(60, bst.inOrderSuccNoParentPointer(bst.root, bst.root).val);
	assertEquals(80, bst.inOrderSuccNoParentPointer(bst.root, bst.root.right).val);
	assertNull(bst.inOrderSuccNoParentPointer(bst.root, bst.root.right.right));

    }

    @Test
    public void inorderSuccWithParentPointer() {

	bst.root2 = bst.new CustomTreeNode(4);
	bst.root2.left = bst.new CustomTreeNode(1);
	bst.root2.left.parent = bst.root2;
	;

	bst.root2.left.right = bst.new CustomTreeNode(2);
	bst.root2.left.right.parent = bst.root2.left;
	bst.root2.left.right.right = bst.new CustomTreeNode(3);
	bst.root2.left.right.right.parent = bst.root2.left.right;

	assertNull(bst.inOrderSuccWithParentPointer(bst.root2, bst.root2));
	assertEquals(2, bst.inOrderSuccWithParentPointer(bst.root2, bst.root2.left).value);
	assertEquals(4, bst.inOrderSuccWithParentPointer(bst.root2, bst.root2.left.right.right).value);

    }

}

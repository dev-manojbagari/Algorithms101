package algorithim.tree;

public class BSTInorderSuccessor {
    public TreeNode root = null;
    public CustomTreeNode root2 = null;

    public class CustomTreeNode {
	int value;
	CustomTreeNode left, right, parent;

	public CustomTreeNode(int value) {
	    this.value = value;
	}
    }

    public TreeNode inOrderSuccNoParentPointer(TreeNode root, TreeNode node) {
	if (root == null)
	    return null;

	if (node.right != null) {
	    TreeNode temp = node.right;

	    while (temp.left != null)
		temp = temp.left;

	    return temp;

	} else {

	    TreeNode curr = node;
	    TreeNode parent = null;

	    while (curr != node) {
		if (curr.val < node.val) {
		    parent = curr;
		    curr = curr.left;
		} else {
		    curr = curr.right;
		}
	    }

	    return parent;
	}

    }

    public CustomTreeNode inOrderSuccWithParentPointer(CustomTreeNode root, CustomTreeNode node) {
	if (root == null)
	    return null;

	if (node.right != null) {
	    CustomTreeNode temp = node.right;

	    while (temp.left != null)
		temp = temp.left;

	    return temp;

	} else {

	    CustomTreeNode curr = node;
	    CustomTreeNode parent = curr.parent;

	    while (parent != null && parent.left != curr) {
		curr = parent;
		parent = curr.parent;
	    }

	    return parent;
	}

    }

}
package algorithim.tree;

// https://www.geeksforgeeks.org/remove-leaf-nodes-binary-search-tree/

public class BSTDeleteLeafNode {
    public TreeNode root = null;

    public TreeNode bstDeleteLeafNode(TreeNode root) {

	if (root == null)
	    return null;

	if (root.left == null && root.right == null) {
	    return null;
	}

	root.left = bstDeleteLeafNode(root.left);
	root.right = bstDeleteLeafNode(root.right);

	return root;

    }

}
package algorithim;

// https://www.geeksforgeeks.org/remove-bst-keys-outside-the-given-range/

public class BSTDeleteInsideRange {
    public TreeNode root = null;

    TreeNode bstDeleteInsideRange(TreeNode root, int min, int max) {
	if (root == null)
	    return null;

	root.left = bstDeleteInsideRange(root.left, min, max);
	root.right = bstDeleteInsideRange(root.right, min, max);

	if (min <= root.value && root.value <= max) {

	    return bstDelete(root);
	}

	return root;
    }

    private TreeNode bstDelete(TreeNode node) {

	if (node.left == null && node.right == null) {
	    return null;
	} else if (node.left != null && node.right != null) {
	    int minRight = minRight(node.right);
	    node.value = minRight;

	    if (node.right.left == null)
		node.right = node.right.right;
	    else
		deleteNode(node.right);

	} else {
	    return node.left != null ? node.left : node.right;

	}

	return node;
    }

    private void deleteNode(TreeNode root) {

	TreeNode parent = null;
	while (root.left != null) {
	    parent = root;
	    root = root.left;
	}

	parent.left = root.right;

    }

    private int minRight(TreeNode node) {
	while (node.left != null)
	    node = node.left;

	return node.value;
    }

}
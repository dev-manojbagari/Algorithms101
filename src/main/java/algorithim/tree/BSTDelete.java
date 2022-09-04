package algorithim.tree;

public class BSTDelete {
    public TreeNode root = null;

    public TreeNode deleteIterative(TreeNode root, int k) {

	if (root == null) {
	    return null;
	}

	TreeNode parent = null;
	TreeNode curr = root;

	while (curr != null && curr.val != k) {
	    parent = curr;
	    if (curr.val > k) {
		curr = curr.left;
	    } else {
		curr = curr.right;
	    }
	}

	if (curr.left == null && curr.right == null) {

	    if (parent == null) {
		root = null;
	    } else if (parent.left == curr) {
		parent.left = null;
	    } else {
		parent.right = null;
	    }
	} else if (curr.left != null && curr.right != null) {

	    int minRight = minRight(curr.right);
	    curr.val = minRight;

	    curr.right = deleteMinRight(curr.right);

	} else {

	    TreeNode child = curr.left != null ? curr.left : curr.right;
	    if (parent == null) {
		root = child;
	    }

	    else if (parent.left == curr) {
		parent.left = child;
	    } else {
		parent.right = child;
	    }

	}

	return root;
    }

    private int minRight(TreeNode node) {

	while (node.left != null) {
	    node = node.left;
	}

	return node.val;
    }

    private TreeNode deleteMinRight(TreeNode node) {
	if (node.left == null)
	    return node.right;
	TreeNode parent = null;
	TreeNode curr = node;

	while (node.left != null) {
	    parent = curr;
	    curr = curr.left;
	}
	parent.left = curr.right;

	return node;
    }

    public TreeNode deleteRecursive(TreeNode root, int value) {
	if (root == null)
	    return null;
	else if (root.val < value)
	    root.right = deleteRecursive(root.right, value);
	else if (root.val > value)
	    root.left = deleteRecursive(root.left, value);
	else {

	    if (root.left == null && root.right == null) {

		return null;

	    } else if (root.left != null && root.right != null) {

		int minRightTree = minRight(root.right);

		root.val = minRightTree;

		root.right = deleteRecursive(root.right, minRightTree);

	    } else {

		TreeNode child = root.left != null ? root.left : root.right;

		return child;
	    }

	}

	return root;
    }

}
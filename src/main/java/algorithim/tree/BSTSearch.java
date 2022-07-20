package algorithim.tree;

public class BSTSearch {
    public TreeNode root = null;

    public boolean searchIterative(TreeNode root, int value) {

	if (root == null)
	    return false;

	TreeNode curr = root;

	while (curr != null && curr.val != value) {
	    if (curr.val < value)
		curr = curr.right;
	    else
		curr = curr.left;
	}

	return curr == null ? false : true;
    }

    public boolean searchRecursive(TreeNode root, int value) {

	if (root == null)
	    return false;
	else if (root.val < value)
	    return searchRecursive(root.right, value);
	else if (root.val > value)
	    return searchRecursive(root.left, value);
	else
	    return true;
    }

}
package algorithim.tree;

import java.util.Stack;

public class IsBST {
    public TreeNode root = null;

    public boolean isBSTIterative(TreeNode root) {
	if (root == null)
	    return true;

	TreeNode curr = root;
	TreeNode prev = null;

	Stack<TreeNode> stack = new Stack<>();

	while (curr != null || stack.isEmpty()) {

	    while (curr != null) {
		stack.push(curr);
		curr = curr.left;
	    }

	    curr = stack.pop();

	    if (prev != null && prev.value > curr.value)
		return false;

	    prev = curr;
	    curr = curr.right;

	}

	return true;
    }

    public boolean isBSTRecursive(TreeNode root) {
	if (root == null)
	    return true;

	return isBSTRecursive(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTRecursive(TreeNode root, int min, int max) {
	if (root == null)
	    return true;

	if (min > root.value || root.value > max)
	    return false;

	boolean l = isBSTRecursive(root.left, min, root.value);
	boolean r = isBSTRecursive(root.right, root.value, max);

	return l && r;
    }

}
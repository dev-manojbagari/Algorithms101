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

	    if (prev != null && prev.val >= curr.val)
		return false;

	    prev = curr;
	    curr = curr.right;

	}

	return true;
    }

    public boolean isBSTRecursive(TreeNode root) {
	if (root == null)
	    return true;

	return isBSTRecursive(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isBSTRecursive(TreeNode root, long min, long max) {
	if (root == null)
	    return true;

	if (min >= root.val || root.val >= max)
	    return false;

	boolean l = isBSTRecursive(root.left, min, root.val);
	boolean r = isBSTRecursive(root.right, root.val, max);

	return l && r;
    }

}
package algorithim.tree;

public class BTIsHeightBalanced {
    public TreeNode root = null;

    // O(n^2)
    public boolean isBalanced(TreeNode root) {
	if (root == null)
	    return true;

	int lh = Height(root.left);
	int rh = Height(root.right);

	boolean l = isBalanced(root.left);
	boolean r = isBalanced(root.right);

	if (Math.abs(lh - rh) > 1)
	    return false;

	return l && r;
    }

    private int Height(TreeNode root) {

	if (root == null)
	    return 0;

	return 1 + Math.max(Height(root.left), Height(root.right));
    }

    private class Height {
	int h;
    }

    // O(n)
    public boolean isBalanced2(TreeNode root) {
	if (root == null)
	    return true;

	return isBalanced2(root, new Height());

    }

    public boolean isBalanced2(TreeNode root, Height height) {
	if (root == null)
	    return true;

	Height lh = new Height();
	Height rh = new Height();

	boolean l = isBalanced2(root.left, lh);
	if (!l)
	    return false;

	boolean r = isBalanced2(root.right, rh);
	if (!r)
	    return false;

	height.h = 1 + Math.max(lh.h, rh.h);

	if (Math.abs(lh.h - rh.h) > 1)
	    return false;

	return l && r;
    }

    public boolean isBalanced3(TreeNode root) {

	if (root == null)
	    return true;

	return helper(root) != -1;

    }

    private int helper(TreeNode root) {
	if (root == null)
	    return 0;

	int lh = helper(root.left);
	if (lh == -1)
	    return -1;
	int rh = helper(root.right);
	if (lh == -1 || rh == -1 || Math.abs(lh - rh) > 1) {
	    return -1;
	}

	return 1 + Math.max(lh, rh);
    }
}
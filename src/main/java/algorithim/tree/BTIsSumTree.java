package algorithim.tree;

public class BTIsSumTree {
    public TreeNode root = null;

    private class Sum {
	int s;
    }

    // O(n)
    public boolean isSumTree(TreeNode root) {
	if (root == null)
	    return true;

	return isSumTree(root, new Sum());

    }

    public boolean isSumTree(TreeNode root, Sum sum) {
	if (root == null)
	    return true;

	Sum ls = new Sum();
	Sum rs = new Sum();

	boolean l = isSumTree(root.left, ls);
	if (!l)
	    return false;

	boolean r = isSumTree(root.right, rs);
	if (!r)
	    return false;

	sum.s = root.val + ls.s + rs.s;

	if (root.left != null && root.right != null)
	    if (root.val != ls.s + rs.s)
		return false;

	return l && r;
    }

}
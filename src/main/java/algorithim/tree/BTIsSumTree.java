package algorithim.tree;

public class BTIsSumTree {
    public TreeNode root = null;

    private class Tree {
	int sum;
    }

    // O(n)
    public boolean isSumTree(TreeNode root) {
	if (root == null)
	    return true;

	return isSumTree(root, new Tree());

    }

    public boolean isSumTree(TreeNode root, Tree sum) {
	if (root == null)
	    return true;

	Tree lst = new Tree();
	Tree rst = new Tree();

	boolean l = isSumTree(root.left, lst);
	if (!l)
	    return false;

	boolean r = isSumTree(root.right, rst);
	if (!r)
	    return false;

	sum.sum = root.val + lst.sum + rst.sum;

	if (root.left != null || root.right != null)
	    if (root.val != lst.sum + rst.sum)
		return false;

	return l && r;
    }

}
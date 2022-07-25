package algorithim.tree;

public class BTSubtreeSum {
    public TreeNode root = null;

    private class Tree {
	int sum;
    }

    public boolean subtreeSum(TreeNode root, int k) {

	if (root == null)
	    return false;

	return subtreeSum(root, k, new Tree());

    }

    public boolean subtreeSum(TreeNode root, int k, Tree tree) {

	if (root == null)
	    return false;

	Tree lst = new Tree();
	Tree rst = new Tree();

	boolean l = subtreeSum(root.left, k, lst);
	if (l)
	    return true;

	boolean r = subtreeSum(root.right, k, rst);
	if (r)
	    return r;

	tree.sum = lst.sum + root.val + rst.sum;

	if (tree.sum == k)
	    return true;

	return l || r;
    }

}
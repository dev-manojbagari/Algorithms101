package algorithim.tree;

public class BSTDeadEnd {
    public TreeNode root = null;

    public boolean deadEnd(TreeNode root) {

	if (root == null)
	    return false;

	return deadEnd(root, 1, Integer.MAX_VALUE);
    }

    private boolean deadEnd(TreeNode root, int min, int max) {

	if (root == null)
	    return false;

	boolean l = deadEnd(root.left, min, root.val - 1);
	if (l)
	    return true;
	boolean r = deadEnd(root.right, root.val + 1, max);

	if (min > root.val - 1 && root.val + 1 > max)
	    return true;

	return l || r;
    }

}
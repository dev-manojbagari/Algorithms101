package algorithim.tree;

public class BTAreIdentical {
    public TreeNode root = null;

    public boolean areIdentical(TreeNode root1, TreeNode root2) {

	if (root1 == null && root2 == null)
	    return true;

	if (root1 == null || root2 == null)
	    return false;

	if (root1.val != root2.val)
	    return false;

	boolean l = areIdentical(root1.left, root2.left);
	boolean r = areIdentical(root1.right, root2.right);

	return l && r;

    }

}
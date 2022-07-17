package algorithim.tree;

public class BTAreFoldable {
    public TreeNode root = null;

    public boolean areFoldable(TreeNode root1, TreeNode root2) {

	if (root1 == null && root2 == null)
	    return true;

	if (root1 == null || root2 == null)
	    return false;

	boolean l = areFoldable(root1.left, root2.right);
	boolean r = areFoldable(root1.right, root2.left);

	return l && r;

    }

}
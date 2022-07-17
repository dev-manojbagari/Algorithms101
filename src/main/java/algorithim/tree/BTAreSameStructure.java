package algorithim.tree;

public class BTAreSameStructure {
    public TreeNode root = null;

    public boolean areSameStructure(TreeNode root1, TreeNode root2) {

	if (root1 == null && root2 == null)
	    return true;

	if (root1 == null || root2 == null)
	    return false;

	boolean l = areSameStructure(root1.left, root2.left);
	boolean r = areSameStructure(root1.right, root2.right);

	return l && r;

    }

}
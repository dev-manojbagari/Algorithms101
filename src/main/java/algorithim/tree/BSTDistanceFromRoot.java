package algorithim.tree;

public class BSTDistanceFromRoot {
    public TreeNode root = null;

    public int distanceFromRoot(TreeNode root, int i) {
	if (root == null)
	    return -1;

	return distanceFromRoot(root, i, 0);
    }

    private int distanceFromRoot(TreeNode root, int i, int level) {

	if (root == null)
	    return -1;

	if (root.val == i)
	    return level;

	if (root.val < i)
	    return distanceFromRoot(root.right, i, level + 1);
	else
	    return distanceFromRoot(root.left, i, level + 1);

    }

}
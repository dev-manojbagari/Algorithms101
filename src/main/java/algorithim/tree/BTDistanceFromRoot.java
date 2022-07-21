package algorithim.tree;

public class BTDistanceFromRoot {
    public TreeNode root = null;

    public int distanceFromRoot(TreeNode root, int i) {
	if (root == null)
	    return 0;
	return distanceFromRoot(root, i, 0);
    }

    private int distanceFromRoot(TreeNode root, int i, int level) {

	if (root == null)
	    return -1;

	if (root.val == i)
	    return level;

	int l = distanceFromRoot(root.left, i, level + 1);
	if (l != -1)
	    return l;

	int r = distanceFromRoot(root.right, i, level + 1);

	return r;
    }

}
package algorithim.tree;

public class BTCountGoodNodes {
    public TreeNode root = null;

    int count = 0;
    int max;

    public int goodNodes(TreeNode root) {
	if (root == null)
	    return 0;

	max = root.val;

	goodNodesRecur(root, max);

	return count;
    }

    private void goodNodesRecur(TreeNode root, int max) {
	if (root == null)
	    return;

	if (root.val >= max) {
	    count++;
	    max = root.val;
	}

	goodNodesRecur(root.left, max);
	goodNodesRecur(root.right, max);

    }

}

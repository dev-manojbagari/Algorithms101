package algorithim.tree;

public class BTMaxPathSum {
    public TreeNode root = null;

    public int maxPathSum(TreeNode root) {

	if (root == null)
	    return 0;
	int[] max = { Integer.MIN_VALUE };
	maxPathSum(root, max);
	return max[0];
    }

    private int maxPathSum(TreeNode root, int[] maxSum) {

	if (root == null)
	    return 0;

	int l = maxPathSum(root.left, maxSum);
	if (l < 0)
	    l = 0;

	int r = maxPathSum(root.right, maxSum);
	if (r < 0)
	    r = 0;

	maxSum[0] = Math.max(maxSum[0], root.value + l + r);

	return root.value + Math.max(l, r);
    }

}
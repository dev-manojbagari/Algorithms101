package algorithim.tree;

public class BTSubtreeMaxSum {
    public TreeNode root = null;

    public int maxSubtreeSum(TreeNode root) {

	if (root == null)
	    return 0;

	int[] maxSum = { Integer.MIN_VALUE };

	maxSubtreeSum(root, maxSum);

	return maxSum[0];
    }

    private int maxSubtreeSum(TreeNode root, int[] maxSum) {

	if (root == null)
	    return 0;

	int l = maxSubtreeSum(root.left, maxSum);
	int r = maxSubtreeSum(root.right, maxSum);

	int sum = l + root.val + r;

	maxSum[0] = Math.max(maxSum[0], sum);

	return sum;
    }

}
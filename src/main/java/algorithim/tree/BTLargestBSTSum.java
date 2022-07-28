package algorithim.tree;

public class BTLargestBSTSum {
    public TreeNode root = null;

    private class Tree {
	boolean isBST = true;
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	int sum;
    }

    public int maxSumBST(TreeNode root) {
	if (root == null)
	    return 0;

	int[] maxSum = { Integer.MIN_VALUE };

	maxSumBST(root, new Tree(), maxSum);

	return maxSum[0];
    }

    private void maxSumBST(TreeNode root, Tree tree, int[] maxSum) {

	if (root == null)
	    return;

	Tree lst = new Tree();
	Tree rst = new Tree();

	maxSumBST(root.left, lst, maxSum);
	maxSumBST(root.right, rst, maxSum);

	if (lst.isBST == true && rst.isBST == true && lst.max < root.val && root.val < rst.min) {

	    tree.isBST = true;

	    tree.min = root.left == null ? root.val : lst.min;
	    tree.max = root.right == null ? root.val : rst.max;
	    tree.sum = lst.sum + root.val + rst.sum;
	    maxSum[0] = Math.max(maxSum[0], tree.sum);

	} else {
	    tree.isBST = false;
	}

    }

}
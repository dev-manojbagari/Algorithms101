package algorithim.tree;

public class BTLargestBSTSum {
    public TreeNode root = null;

    private class Tree {
	boolean isBST = true;
	int sum = 0;
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	int maxSum = 0;
    }

    public int maxSumBST(TreeNode root) {

	if (root == null)
	    return 0;
	Tree tree = new Tree();
	maxSumBST(root, tree);

	return tree.maxSum;
    }

    private void maxSumBST(TreeNode root, Tree tree) {

	if (root == null)
	    return;

	Tree lst = new Tree();
	Tree rst = new Tree();

	maxSumBST(root.left, lst);
	maxSumBST(root.right, rst);
	if (lst.isBST == true && rst.isBST == true && lst.max < root.val && root.val < rst.min) {
	    tree.isBST = true;

	    tree.sum = lst.sum + root.val + rst.sum;
	    tree.maxSum = Math.max(Math.max(lst.maxSum, rst.maxSum), tree.sum);

	    tree.min = root.left != null ? lst.min : root.val;
	    tree.max = root.right != null ? rst.max : root.val;
	    return;
	}

	tree.isBST = false;
	tree.maxSum = Math.max(lst.maxSum, rst.maxSum);
    }

}
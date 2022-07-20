package algorithim.tree;

public class BTLargestBST {
    public TreeNode root = null;

    private class Tree {
	boolean isBST = true;
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	int size = 0;
    }

    public int largestBST(TreeNode root) {
	if (root == null)
	    return 0;

	Tree tree = new Tree();
	int maxSize[] = { Integer.MIN_VALUE };
	maxBST(root, tree, maxSize);

	return maxSize[0];
    }

    private void maxBST(TreeNode root, Tree tree, int[] maxSize) {

	if (root == null)
	    return;

	Tree lst = new Tree();
	Tree rst = new Tree();

	maxBST(root.left, lst, maxSize);
	maxBST(root.right, rst, maxSize);

	if (lst.isBST == true && rst.isBST == true && lst.max < root.val && root.val < rst.min) {

	    tree.isBST = true;

	    tree.min = root.left == null ? root.val : lst.min;
	    tree.max = root.right == null ? root.val : rst.max;

	    tree.size = 1 + lst.size + rst.size;
	    maxSize[0] = Math.max(maxSize[0], tree.size);

	} else
	    tree.isBST = false;

    }

}
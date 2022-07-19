package algorithim.tree;

public class BTLargestBST {
    public TreeNode root = null;

    private class Tree {
	boolean isBST = true;
	Integer min = Integer.MAX_VALUE;
	Integer max = Integer.MIN_VALUE;
	int size;
    }

    public int largestBST(TreeNode root) {
	if (root == null)
	    return 0;

	Tree tree = new Tree();
	largestBST(root, tree);
	return tree.size;
    }

    private void largestBST(TreeNode root, Tree tree) {

	if (root == null) {
	    return;
	}

	Tree lsb = new Tree();
	Tree rsb = new Tree();

	largestBST(root.left, lsb);
	largestBST(root.right, rsb);

	if (lsb.isBST == true && rsb.isBST == true) {
	    if (lsb.max < root.value && root.value < rsb.min) {
		tree.isBST = true;
		tree.size = 1 + lsb.size + rsb.size;
		tree.min = Math.min(root.value, lsb.min);
		tree.max = Math.max(root.value, rsb.max);
		return;

	    }
	}
	tree.isBST = false;
	tree.size = Math.max(lsb.size, rsb.size);

    }

}
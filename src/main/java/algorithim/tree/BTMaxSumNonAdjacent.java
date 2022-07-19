package algorithim.tree;

public class BTMaxSumNonAdjacent {
    public TreeNode root = null;

    private class Pair {
	int incl;
	int excl;
    }

    public int maxSumNonAdj(TreeNode root) {
	if (root == null)
	    return 0;

	Pair pair = new Pair();

	maxSumNonAdj(root, pair);

	return Math.max(pair.incl, pair.excl);
    }

    private void maxSumNonAdj(TreeNode root, Pair pair) {

	if (root == null)
	    return;

	Pair left = new Pair();
	Pair right = new Pair();

	maxSumNonAdj(root.left, left);
	maxSumNonAdj(root.right, right);

	pair.incl = root.value + left.excl + right.excl;
	pair.excl = Math.max(left.incl, left.excl) + Math.max(right.incl, right.excl);

    }

}
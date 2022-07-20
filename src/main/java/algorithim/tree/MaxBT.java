package algorithim.tree;

import java.util.OptionalInt;

public class MaxBT {
    public TreeNode root = null;

    public OptionalInt maxBT(TreeNode root) {
	if (root == null)
	    return OptionalInt.empty();

	int[] max = { Integer.MIN_VALUE };
	maxBT(root, max);
	return OptionalInt.of(max[0]);
    }

    private void maxBT(TreeNode root, int[] max) {

	if (root == null)
	    return;

	max[0] = Math.max(root.val, max[0]);

	maxBT(root.left, max);
	maxBT(root.right, max);
    }
}
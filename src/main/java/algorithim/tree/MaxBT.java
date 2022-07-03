package algorithim.tree;

import java.util.OptionalInt;

public class MaxBT {
	public TreeNode root = null;

	OptionalInt maxBT(TreeNode root) {

		if (root == null)
			return OptionalInt.empty();

		return OptionalInt.of(maxBTRecursive(root));
	}

	int maxBTRecursive(TreeNode root) {

		if (root.left == null && root.right == null)
			return root.value;

		if (root.left == null || root.right == null) {
			if (root.left != null)
				return Math.max(root.value, maxBTRecursive(root.left));
			else
				return Math.max(root.value, maxBTRecursive(root.right));

		}

		return Math.max(root.value, Math.max(maxBTRecursive(root.left), maxBTRecursive(root.right)));
	}
}
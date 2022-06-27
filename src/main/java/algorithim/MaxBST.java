package algorithim;

import java.util.OptionalInt;


public class MaxBST {
	public TreeNode root = null;

	OptionalInt maxBST(TreeNode root) {

		if (root == null)
			return OptionalInt.empty();

		while (root.right != null)
			root = root.right;

		return  OptionalInt.of(root.value);
	}
}
package algorithim;

// https://www.geeksforgeeks.org/remove-bst-keys-outside-the-given-range/

public class BSTDeleteOutsideRange {
	public TreeNode root = null;

	TreeNode bstDeleteOutsideRange(TreeNode root, int min, int max) {
		if (root == null)
			return null;

		root.left = bstDeleteOutsideRange(root.left, min, max);
		root.right = bstDeleteOutsideRange(root.right, min, max);

		if (root.value < min)
			return root.right;

		if (root.value > max)
			return root.left;

		return root;
	}

}
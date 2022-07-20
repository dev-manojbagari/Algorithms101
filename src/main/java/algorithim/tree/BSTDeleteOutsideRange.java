package algorithim.tree;

// https://www.geeksforgeeks.org/remove-bst-keys-outside-the-given-range/

public class BSTDeleteOutsideRange {
	public TreeNode root = null;

	TreeNode bstDeleteOutsideRange(TreeNode root, int min, int max) {
		if (root == null)
			return null;

		root.left = bstDeleteOutsideRange(root.left, min, max);
		root.right = bstDeleteOutsideRange(root.right, min, max);

		if (root.val < min)
			return root.right;

		if (root.val > max)
			return root.left;

		return root;
	}

}
package algorithim;

public class BSTDelete {
	public TreeNode root = null;

	public TreeNode deleteIterative(TreeNode root, int value) {

		if (root == null)
			return null;

		TreeNode curr = root;
		TreeNode parent = null;

		while (curr != null && curr.value != value) {
			parent = curr;
			if (curr.value < value) {
				curr = curr.right;
			} else {
				curr = curr.left;
			}

		}

		if (curr == null)
			return root;

		if (curr.left == null && curr.right == null) {

			if (parent == null)
				return null;

			if (parent.left == curr)
				parent.left = null;
			else
				parent.right = null;

		} else if (curr.left != null && curr.right != null) {

			int minRightTree = minRight(curr.right);

			curr.value = minRightTree;

			curr.right = deleteIterative(curr.right, minRightTree);

		} else {

			TreeNode child = curr.left != null ? curr.left : curr.right;

			if (parent.left == curr)
				parent.left = child;
			else
				parent.right = child;

		}

		return root;
	}

	private int minRight(TreeNode node) {

		while (node.left != null) {
			node = node.left;
		}

		return node.value;
	}

	public TreeNode deleteRecursive(TreeNode root, int value) {
		if (root == null)
			return null;
		else if (root.value < value)
			root.right = deleteRecursive(root.right, value);
		else if (root.value > value)
			root.left = deleteRecursive(root.left, value);
		else {

			if (root.left == null && root.right == null) {

				return null;

			} else if (root.left != null && root.right != null) {

				int minRightTree = minRight(root.right);

				root.value = minRightTree;

				root.right = deleteRecursive(root.right, minRightTree);

			} else {

				TreeNode child = root.left != null ? root.left : root.right;

	            return child;
			}

		}

		return root;
	}

}
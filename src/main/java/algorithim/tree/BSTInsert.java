package algorithim.tree;

public class BSTInsert {
	public TreeNode root = null;

	public TreeNode insertIterative(TreeNode root, int value) {
		if (root == null)
			root = new TreeNode(value);
		else {
			TreeNode curr = root;
			TreeNode parent = null;

			while (curr != null) {
				parent = curr;
				if (curr.val <= value)
					curr = curr.right;
				else
					curr = curr.left;
			}

			if (parent.val <= value)
				parent.right = new TreeNode(value);
			else
				parent.left = new TreeNode(value);

		}

		return root;

	}

	public TreeNode insertRecursive(TreeNode root, int value) {

		if (root == null)
			return new TreeNode(value);
		else if (root.val <= value)
			root.right = insertRecursive(root.right, value);
		else
			root.left = insertRecursive(root.left, value);

		return root;
	}

}
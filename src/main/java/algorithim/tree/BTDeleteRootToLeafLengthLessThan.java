package algorithim.tree;

// https://www.geeksforgeeks.org/remove-nodes-root-leaf-paths-length-k/

public class BTDeleteRootToLeafLengthLessThan {
    public TreeNode root = null;

    TreeNode bstDeleteRootToLeadLengthLessThan(TreeNode root, int k) {

	if (root == null)
	    return null;

	root.left = bstDeleteRootToLeadLengthLessThan(root.left, k - 1);
	root.right = bstDeleteRootToLeadLengthLessThan(root.right, k - 1);

	if (root.left == null && root.right == null) {
	    if (k > 1)
		return null;
	}

	return root;
    }

}
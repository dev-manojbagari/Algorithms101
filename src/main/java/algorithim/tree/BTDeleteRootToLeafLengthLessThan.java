package algorithim.tree;

// https://www.geeksforgeeks.org/remove-nodes-root-leaf-paths-length-k/

public class BTDeleteRootToLeafLengthLessThan {
    public TreeNode root = null;

    TreeNode bstDeleteRootToLeadLengthLessThan(TreeNode root, int k) {
	if (root == null)
	    return root;

	return bstDeleteRootToLeadLengthLessThan(root, k, 0);
    }

    private TreeNode bstDeleteRootToLeadLengthLessThan(TreeNode root, int k, int pathLen) {

	if (root == null)
	    return null;

	if (root.left == null && root.right == null) {
	    if (pathLen + 1 < k)
		return null;
	    else
		return root;
	}

	root.left = bstDeleteRootToLeadLengthLessThan(root.left, k, pathLen + 1);
	root.right = bstDeleteRootToLeadLengthLessThan(root.right, k, pathLen + 1);

	if (root.left == null && root.right == null)
	    return null;
	else
	    return root;
    }

}
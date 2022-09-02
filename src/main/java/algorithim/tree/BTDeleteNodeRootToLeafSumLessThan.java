package algorithim.tree;

// https://www.geeksforgeeks.org/remove-all-nodes-which-lie-on-a-path-having-sum-less-than-k/

public class BTDeleteNodeRootToLeafSumLessThan {
    public TreeNode root = null;

    public void bstDeleteNodeRootToLeadPathSumLessThan(TreeNode root, int k) {

	if (root == null)
	    return;

	bstDeleteNodeRootToLeadPathSumLessThan(root, 0, k);

	return;

    }

    private TreeNode bstDeleteNodeRootToLeadPathSumLessThan(TreeNode root, int pathSum, int k) {
	if (root == null)
	    return null;

	if (root.left == null && root.right == null)
	    if (pathSum + root.val < k)
		return null;
	    else
		return root;

	root.left = bstDeleteNodeRootToLeadPathSumLessThan(root.left, pathSum + root.val, k);
	root.right = bstDeleteNodeRootToLeadPathSumLessThan(root.right, pathSum + root.val, k);

	if (root.left == null && root.right == null)
	    return null;

	return root;

    }

}
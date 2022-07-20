package algorithim.tree;

// https://www.geeksforgeeks.org/remove-all-nodes-which-lie-on-a-path-having-sum-less-than-k/

public class BTDeleteNodeRootToLeafSumLessThan {
    public TreeNode root = null;

    public TreeNode bstDeleteNodeRootToLeadPathSumLessThan(TreeNode root, int sum) {

	if (root == null)
	    return null;

	root.left = bstDeleteNodeRootToLeadPathSumLessThan(root.left, sum - root.val);
	root.right = bstDeleteNodeRootToLeadPathSumLessThan(root.right, sum - root.val);

	if (root.left == null && root.right == null) {

	    if (sum - root.val > 0)
		return null;

	}

	return root;

    }

}
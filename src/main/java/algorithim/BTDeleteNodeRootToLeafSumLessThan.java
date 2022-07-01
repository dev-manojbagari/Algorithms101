package algorithim;

// https://www.geeksforgeeks.org/remove-all-nodes-which-lie-on-a-path-having-sum-less-than-k/

public class BTDeleteNodeRootToLeafSumLessThan {
    public TreeNode root = null;

    public TreeNode bstDeleteNodeRootToLeadPathSumLessThan(TreeNode root, int sum) {

	if (root == null)
	    return null;

	root.left = bstDeleteNodeRootToLeadPathSumLessThan(root.left, sum - root.value);
	root.right = bstDeleteNodeRootToLeadPathSumLessThan(root.right, sum - root.value);

	if (root.left == null && root.right == null) {

	    if (sum - root.value > 0)
		return null;

	}

	return root;

    }

}
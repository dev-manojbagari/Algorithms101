package algorithim.tree;

public class BTKthAncestors {
    public TreeNode root = null;

    public int kthAncestors(TreeNode root, int val, int k) {
	if (root == null || root.val == val)
	    return -1;
	NodeInfo ancesstor = new NodeInfo();
	ancestors(root, val, k, ancesstor);

	return ancesstor.val;
    }

    private class NodeInfo {
	int pos;
	int val = -1;
    }

    private boolean ancestors(TreeNode root, int val, int k, NodeInfo ancesstor) {

	if (root == null)
	    return false;

	if (root.val == val) {
	    return true;
	}

	if (ancestors(root.left, val, k, ancesstor) || ancestors(root.right, val, k, ancesstor)) {
	    ancesstor.pos++;
	    if (ancesstor.pos == k)
		ancesstor.val = root.val;

	    return true;
	}

	return false;
    }

}
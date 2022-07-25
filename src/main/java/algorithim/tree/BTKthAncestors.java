package algorithim.tree;

public class BTKthAncestors {
    public TreeNode root = null;

    private class Ancestor {
	int pos;
	TreeNode node = null;
    }

    public TreeNode kthAncestors(TreeNode root, int val, int k) {
	if (root == null)
	    return null;

	Ancestor ancestor = new Ancestor();
	kthAncestors(root, val, k, ancestor);

	return ancestor.node != null ? ancestor.node : null;
    }

    private boolean kthAncestors(TreeNode root, int val, int k, Ancestor ancestor) {

	if (root == null)
	    return false;

	if (root.val == val) {
	    return true;
	}

	if (kthAncestors(root.left, val, k, ancestor) || kthAncestors(root.right, val, k, ancestor)) {
	    ancestor.pos++;
	    if (ancestor.pos == k) {
		ancestor.node = root;
	    }
	    return true;
	}

	return false;

    }

}
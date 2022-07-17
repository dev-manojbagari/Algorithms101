package algorithim.tree;

public class BTAreMirror {
    public TreeNode root = null;

    public boolean areMirror(TreeNode root1, TreeNode root2) {

	if (root1 == null && root2 == null)
	    return true;

	if (root1 == null || root2 == null)
	    return false;

	if (root1.value != root2.value)
	    return false;

	boolean l = areMirror(root1.left, root2.right);
	boolean r = areMirror(root1.right, root2.left);

	return l && r;

    }

}
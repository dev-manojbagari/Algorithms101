package algorithim.tree;

public class BTLCA {
    public TreeNode root = null;

    public TreeNode lca(TreeNode root, int i, int j) {

	if (root == null)
	    return null;

	TreeNode LCA = lcaRec(root, i, j, null);

	if (LCA.val == i)
	    return find(LCA, j) == true ? LCA : null;
	else if (LCA.val == j)
	    return find(LCA, i) == true ? LCA : null;

	return LCA;
    }

    private boolean find(TreeNode root, int i) {
	if (root == null)
	    return false;
	if (root.val == i)
	    return true;

	return find(root.left, i) || find(root.right, i);
    }

    private TreeNode lcaRec(TreeNode root, int i, int j, TreeNode LCA) {

	if (LCA != null)
	    return LCA;

	if (root == null)
	    return null;

	if (root.val == i || root.val == j)
	    return root;

	TreeNode l = lcaRec(root.left, i, j, LCA);
	TreeNode r = lcaRec(root.right, i, j, LCA);

	if (l != null && r != null) {
	    LCA = root;
	    return root;
	}

	return l != null ? l : r;
    }

}
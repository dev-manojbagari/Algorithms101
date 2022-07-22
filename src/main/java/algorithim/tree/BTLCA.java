package algorithim.tree;

public class BTLCA {
    public TreeNode root = null;

    public TreeNode lca(TreeNode root, int i, int j) {
	if (root == null)
	    return null;

	TreeNode lcaNode = lcaRecur(root, i, j);

	if (lcaNode != null) {
	    if (lcaNode.val == i) {
		return findNode(lcaNode, j) == true ? lcaNode : null;
	    } else
		return findNode(lcaNode, j) == true ? lcaNode : null;
	}

	return lcaNode;
    }

    private boolean findNode(TreeNode root, int j) {
	if (root == null)
	    return false;

	if (root.val == j)
	    return true;

	return findNode(root.left, j) || findNode(root.right, j);

    }

    private TreeNode lcaRecur(TreeNode root, int i, int j) {

	if (root == null)
	    return null;

	if (root.val == i || root.val == j)
	    return root;

	TreeNode l = lcaRecur(root.left, i, j);
	TreeNode r = lcaRecur(root.right, i, j);

	if (l != null && r != null)
	    return root;

	return l != null ? l : r;
    }

}
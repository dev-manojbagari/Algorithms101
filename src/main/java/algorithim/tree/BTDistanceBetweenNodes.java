package algorithim.tree;

public class BTDistanceBetweenNodes {
    public TreeNode root = null;

    public int findDistance(TreeNode root, int i, int j) {

	if (root == null)
	    return -1;

	TreeNode lca = lca(root, i, j);

	if (lca == null)
	    return -1;

	int id = distanceFromRoot(lca, i, 0);
	int jd = distanceFromRoot(lca, j, 0);
	return id + jd;
    }

    private int distanceFromRoot(TreeNode root, int i, int level) {

	if (root == null)
	    return -1;

	if (root.val == i)
	    return level;

	int l = distanceFromRoot(root.left, i, level + 1);
	if (l != -1)
	    return l;

	int r = distanceFromRoot(root.right, i, level + 1);
	if (r != -1)
	    return r;

	return -1;
    }

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
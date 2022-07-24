package algorithim.tree;

public class BTIsChildSumTree {
    public TreeNode root = null;

    public boolean isChildSumTree(TreeNode root) {

	if (root == null)
	    return true;

	if (root.left == null && root.right == null)
	    return true;

	int leftChildVal = root.left != null ? root.left.val : 0;
	int rightChildVal = root.right != null ? root.right.val : 0;

	if (root.val != leftChildVal + rightChildVal)
	    return false;

	return isChildSumTree(root.left) && isChildSumTree(root.right);

    }

}
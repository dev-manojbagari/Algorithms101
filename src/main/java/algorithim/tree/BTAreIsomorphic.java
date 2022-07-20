package algorithim.tree;

public class BTAreIsomorphic {
    public TreeNode root = null;

//Two trees are called isomorphic if one of them can be obtained from other by a series of flips, i.e. by swapping left and right children of a number of nodes 
    public boolean areIsomorphic(TreeNode root1, TreeNode root2) {

	if (root1 == null && root2 == null)
	    return true;

	if (root1 == null || root2 == null)
	    return false;

	if (root1.val != root2.val)
	    return false;

	return areIsomorphic(root1.left, root2.left) && areIsomorphic(root1.right, root2.right)
		|| areIsomorphic(root1.left, root2.right) && areIsomorphic(root1.right, root2.left);

    }

}
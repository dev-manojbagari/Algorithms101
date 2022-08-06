package algorithim.tree;

import java.util.HashSet;
import java.util.Set;

public class BTDupSub {
    public TreeNode root = null;

    private class Tree {
	StringBuilder asString = new StringBuilder();
    }

    boolean dupSub(TreeNode root) {

	if (root == null)
	    return false;

	Set<String> set = new HashSet<>();

	return dupST(root, set, new Tree());
    }

    private boolean dupST(TreeNode root, Set<String> set, Tree tree) {

	if (root == null) {
	    tree.asString.append(",#");
	    return false;
	}

	Tree lst = new Tree();
	Tree rst = new Tree();

	boolean l = dupST(root.left, set, lst);
	if (l == true)
	    return l;
	boolean r = dupST(root.right, set, rst);
	if (r == true)
	    return r;

	tree.asString.append(lst.asString).append(rst.asString).append("," + root.val + ",");

	if (root.left != null || root.right != null) {
	    if (tree.asString.toString().length() > 6 && set.contains(tree.asString.toString())) {
		return true;
	    }
	}

	set.add(tree.asString.toString());

	return false;
    }

}
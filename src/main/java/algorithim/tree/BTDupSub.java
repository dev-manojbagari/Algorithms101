package algorithim.tree;

import java.util.HashSet;
import java.util.Set;

public class BTDupSub {
    public TreeNode root = null;

    public boolean dupST(TreeNode root) {

	if (root == null)
	    return false;

	Set<String> set = new HashSet<>();

	return dupST(root, set, new Tree());
    }

    private class Tree {
	String asString;

    }

    private boolean dupST(TreeNode root, Set<String> set, Tree tree) {

	if (root == null) {
	    tree.asString = "#";
	    return false;
	}

	Tree lst = new Tree();
	Tree rst = new Tree();

	boolean left = dupST(root.left, set, lst);
	if (left)
	    return true;

	boolean right = dupST(root.right, set, rst);
	if (right)
	    return true;

	StringBuilder sb = new StringBuilder(lst.asString).append(",").append(rst.asString).append(",")
		.append(root.val);
	tree.asString = sb.toString();

	if (tree.asString.length() > 3 && set.contains(tree.asString))
	    return true;

	set.add(tree.asString);

	return left || right;

    }

}
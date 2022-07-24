package algorithim.tree;

import java.util.ArrayList;
import java.util.List;

public class BTAncestors {
    public TreeNode root = null;

    public List<Integer> ancestors(TreeNode root, int k) {
	ArrayList<Integer> list = new ArrayList<>();
	if (root == null || root.val == k)
	    return list;
	ancestors(root, k, list);

	return list;
    }

    private boolean ancestors(TreeNode root, int k, List<Integer> list) {

	if (root == null)
	    return false;

	if (root.val == k)
	    return true;

	if (ancestors(root.left, k, list) || ancestors(root.right, k, list)) {
	    list.add(root.val);
	    return true;
	}

	return false;
    }

}
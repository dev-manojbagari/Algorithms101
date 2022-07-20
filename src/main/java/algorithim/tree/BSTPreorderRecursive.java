package algorithim.tree;

import java.util.ArrayList;
import java.util.List;

public class BSTPreorderRecursive {
    public TreeNode root = null;

    List<Integer> preOrder(TreeNode root) {

	List<Integer> list = new ArrayList<>();

	preOrder(root, list);

	return list;
    }

    void preOrder(TreeNode root, List<Integer> list) {

	if (root == null)
	    return;

	list.add(root.val);

	preOrder(root.left, list);
	preOrder(root.right, list);

    }

}
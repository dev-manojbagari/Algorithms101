package algorithim.tree;

import java.util.ArrayList;
import java.util.List;

public class BSTInorderRecursive {
    public TreeNode root = null;

    public List<Integer> inOrder(TreeNode root) {
	if (root == null)
	    return new ArrayList<Integer>();

	List<Integer> list = new ArrayList<>();

	inOrder(root, list);
	return list;
    }

    private void inOrder(TreeNode root, List<Integer> list) {

	if (root == null)
	    return;

	inOrder(root.left, list);
	list.add(root.value);
	inOrder(root.right, list);

    }

}
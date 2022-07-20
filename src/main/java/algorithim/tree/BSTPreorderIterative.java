package algorithim.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTPreorderIterative {
    public TreeNode root = null;

    List<Integer> preOrder(TreeNode root) {

	List<Integer> list = new ArrayList<>();

	preOrder(root, list);

	return list;
    }

    private void preOrder(TreeNode root, List<Integer> list) {

	if (root == null)
	    return;

	Stack<TreeNode> stack = new Stack<>();
	stack.add(root);

	while (!stack.isEmpty()) {

	    TreeNode curr = stack.pop();
	    list.add(curr.val);

	    if (curr.right != null)
		stack.add(curr.right);

	    if (curr.left != null)
		stack.add(curr.left);

	}

    }

}
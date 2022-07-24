package algorithim.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTRootToNode {
    public TreeNode root = null;

    public List<Integer> rootToNode(TreeNode root, int k) {
	ArrayList<Integer> list = new ArrayList<>();
	if (root == null || root.val == k)
	    return list;

	Stack<Integer> stack = new Stack<>();

	ancestors(root, k, stack);

	while (!stack.isEmpty())
	    list.add(stack.pop());

	return list;
    }

    private boolean ancestors(TreeNode root, int k, Stack<Integer> stack) {

	if (root == null)
	    return false;

	if (root.val == k) {
	    stack.push(root.val);
	    return true;
	}

	if (ancestors(root.left, k, stack) || ancestors(root.right, k, stack)) {
	    stack.push(root.val);
	    return true;
	}

	return false;
    }

}
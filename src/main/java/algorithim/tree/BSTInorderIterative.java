package algorithim.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTInorderIterative {
    public TreeNode root = null;

    public List<Integer> inOrder(TreeNode root) {
	if (root == null)
	    return new ArrayList<>();

	return inOrder(root, new ArrayList<>());
    }

    private List<Integer> inOrder(TreeNode root, List<Integer> list) {

	Stack<TreeNode> stack = new Stack<>();
	TreeNode curr = root;
	while (curr != null || !stack.isEmpty()) {

	    while (curr != null) {
		stack.push(curr);
		curr = curr.left;
	    }

	    curr = stack.pop();
	    list.add(curr.value);
	    curr = curr.right;

	}

	return list;
    }

}
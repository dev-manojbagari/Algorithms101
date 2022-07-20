package algorithim.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTBoundaryTraversal {
    public TreeNode root = null;

    public List<Integer> boundaryTraversal(TreeNode root) {

	List<Integer> list = new ArrayList<>();

	list.add(root.val);
	leftBoundary(root.left, list);
	leafNodes(root, list);
	rightBoundary(root.right, list);

	return list;
    }

    private void rightBoundary(TreeNode root, List<Integer> list) {

	Stack<Integer> stack = new Stack<>();

	while (root != null) {
	    if (root.left != null || root.right != null)
		stack.add(root.val);

	    if (root.right != null)
		root = root.right;
	    else
		root = root.left;
	}

	while (!stack.isEmpty())
	    list.add(stack.pop());

    }

    private void leafNodes(TreeNode root, List<Integer> list) {

	if (root == null)
	    return;

	leafNodes(root.left, list);
	leafNodes(root.right, list);

	if (root.left == null && root.right == null)
	    list.add(root.val);

    }

    private void leftBoundary(TreeNode root, List<Integer> list) {
	while (root != null) {
	    if (root.left != null || root.right != null)
		list.add(root.val);

	    if (root.left != null)
		root = root.left;
	    else
		root = root.right;
	}

    }
}
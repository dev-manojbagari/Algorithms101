package algorithim.tree;

import java.util.Stack;

// https://www.geeksforgeeks.org/remove-leaf-nodes-binary-search-tree/

public class BSTKthSmallestKthLargest {
    public TreeNode root = null;

    public TreeNode bstKthSmallest(TreeNode root, int k) {

	if (root == null)
	    return null;

	int count = 0;

	TreeNode curr = root;
	Stack<TreeNode> stack = new Stack<>();

	while (curr != null || !stack.isEmpty()) {

	    while (curr != null) {
		stack.push(curr);
		curr = curr.left;
	    }
	    curr = stack.pop();
	    count++;
	    if (count == k)
		return curr;
	    curr = curr.right;

	}

	return null;

    }

    public TreeNode bstKthLargest(TreeNode root, int k) {

	if (root == null)
	    return null;

	int count = 0;

	TreeNode curr = root;
	Stack<TreeNode> stack = new Stack<>();

	while (curr != null || !stack.isEmpty()) {

	    while (curr != null) {
		stack.push(curr);
		curr = curr.right;
	    }
	    curr = stack.pop();
	    count++;
	    if (count == k)
		return curr;
	    curr = curr.left;

	}

	return null;

    }

}
package algorithim.tree;

import java.util.Stack;

public class BTInorderSuccessor {
    public TreeNode root = null;

    public TreeNode inOrderSuccIter(TreeNode root, TreeNode node) {

	if (root == null)
	    return null;

	TreeNode curr = root;
	TreeNode prev = null;

	Stack<TreeNode> stack = new Stack<>();

	while (curr != null || !stack.isEmpty()) {

	    while (curr != null) {
		stack.push(curr);
		curr = curr.right;
	    }

	    curr = stack.pop();
	    if (curr == node)
		return prev;

	    prev = curr;
	    curr = curr.left;

	}

	return null;
    }

    private class Inorder {
	TreeNode prev;

    }

    public TreeNode inOrderSuccRecursive(TreeNode root, TreeNode node) {

	if (root == null)
	    return null;

	return inOrderSuccRecursive(root, node, new Inorder());
    }

    private TreeNode inOrderSuccRecursive(TreeNode root, TreeNode node, Inorder inorder) {

	if (root == null)
	    return null;

	TreeNode l = inOrderSuccRecursive(root.right, node, inorder);
	if (l != null)
	    return l;

	if (root == node)
	    return inorder.prev;

	inorder.prev = root;

	TreeNode r = inOrderSuccRecursive(root.left, node, inorder);

	return r;
    }

}
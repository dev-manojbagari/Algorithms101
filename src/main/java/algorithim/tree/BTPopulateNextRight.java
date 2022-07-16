package algorithim.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTPopulateNextRight {
    public TreeNode root = null;

    public class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	TreeNode next;

	public TreeNode(int value) {
	    this.value = value;
	}

    }

    public void btPopulateNextRight(TreeNode root) {

	if (root == null)
	    return;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);

	TreeNode next = null;

	while (!q.isEmpty()) {

	    int levelSize = q.size();
	    next = null;
	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		temp.next = next;

		next = temp;

		if (temp.right != null)
		    q.add(temp.right);

		if (temp.left != null)
		    q.add(temp.left);

	    }

	}

    }

    // constant space
    public void btPopulateNextRight2(TreeNode root) {

	if (root == null)
	    return;

	TreeNode curr = root;

	while (curr != null) {
	    TreeNode temp = curr;
	    while (temp != null) {
		if (temp.left != null)
		    temp.left.next = temp.right;
		if (temp.right != null && temp.next != null)
		    temp.right.next = temp.next.left;

		temp = temp.next;

	    }
	    if (curr.left != null)
		curr = curr.left;
	    else if (curr.right != null)
		curr = curr.right;
	    else {
		while (curr != null && curr.left == null && curr.right == null)
		    curr = curr.next;

		if (curr == null)
		    break;
		else
		    curr = curr.left != null ? curr.left : curr.right;

	    }
	}
    }

}
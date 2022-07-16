package algorithim.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTNextRight {
    public TreeNode root = null;

    public TreeNode btNextRight(TreeNode root, int k) {

	if (root == null)
	    return null;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);

	TreeNode next = null;

	while (!q.isEmpty()) {

	    int levelSize = q.size();
	    next = null;
	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		if (temp.value == k)
		    return next;

		next = temp;

		if (temp.right != null)
		    q.add(temp.right);

		if (temp.left != null)
		    q.add(temp.left);

	    }

	}

	return null;
    }

}
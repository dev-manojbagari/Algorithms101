package algorithim.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTIsCompleteTree {
    public TreeNode root = null;

    public boolean isCompleteTree(TreeNode root) {

	if (root == null)
	    return true;

	Queue<TreeNode> q = new LinkedList<>();

	q.add(root);

	while (!q.isEmpty()) {
	    TreeNode node = q.poll();

	    if (node == null)
		break;

	    q.add(node.left);
	    q.add(node.right);

	}

	while (!q.isEmpty())
	    if (q.poll() != null)
		return false;

	return true;
    }

}
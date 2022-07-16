package algorithim.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTCousionsCheck {
    public TreeNode root = null;

    public boolean areCousionsIter(TreeNode root, int i, int j) {

	if (root == null)
	    return false;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);

	boolean ifound = false, jfound = false;

	while (!q.isEmpty()) {

	    int levelSize = q.size();

	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		if (temp.value == i)
		    ifound = true;

		if (temp.value == j)
		    jfound = true;

		if (temp.left != null && temp.right != null) {
		    if (temp.left.value == i && temp.right.value == j || temp.left.value == j && temp.right.value == i)
			return false;
		}

		if (temp.left != null)
		    q.add(temp.left);
		if (temp.right != null)
		    q.add(temp.right);

	    }

	    if (ifound && jfound)
		return true;
	    else if (ifound || jfound)
		return false;

	}
	return false;
    }

}
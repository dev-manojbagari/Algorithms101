package algorithim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTGetCousions {
    public TreeNode root = null;

    public List<Integer> getCousions(TreeNode root, int i) {

	if (root == null)
	    return null;
	List<Integer> list = new ArrayList<>();
	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);

	boolean ifound = false;

	while (!q.isEmpty() && !ifound) {

	    int levelSize = q.size();

	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		if (temp.left != null && temp.left.value == i)
		    ifound = true;
		else if (temp.right != null && temp.right.value == i)
		    ifound = true;
		else {

		    if (temp.left != null)
			q.add(temp.left);
		    if (temp.right != null)
			q.add(temp.right);
		}
	    }

	    if (ifound) {
		while (!q.isEmpty())
		    list.add(q.poll().value);
		return list;
	    }

	}

	return list;
    }
}
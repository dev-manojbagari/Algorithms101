package algorithim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLevelorderIter {
    public TreeNode root = null;

    public List<Integer> levelOrderIter(TreeNode root) {
	List<Integer> list = new ArrayList<>();
	if (root == null)
	    return list;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);

	while (!q.isEmpty()) {

	    int levelSize = q.size();

	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		list.add(temp.value);

		if (temp.left != null)
		    q.add(temp.left);

		if (temp.right != null)
		    q.add(temp.right);

	    }

	}

	return list;
    }

}
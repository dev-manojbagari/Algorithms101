package algorithim.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTHeight {
    public TreeNode root = null;

    // height is calculated as no of nodes in longest root to leaf path
    public int btHeightRecusive(TreeNode root) {
	if (root == null)
	    return 0;

	return 1 + Math.max(btHeightRecusive(root.left), btHeightRecusive(root.right));
    }

    public int btHeightIterative(TreeNode root) {
	if (root == null)
	    return 0;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);
	int curLvl = 0;
	while (!q.isEmpty()) {
	    curLvl++;
	    int levelSize = q.size();

	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		if (temp.left != null)
		    q.add(temp.left);

		if (temp.right != null)
		    q.add(temp.right);

	    }

	}

	return curLvl;
    }

}
package algorithim.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTVaildateLevelOrder {
    public TreeNode root = null;

    private class TreeNode {
	int val;
	int min = Integer.MIN_VALUE;
	int max = Integer.MAX_VALUE;

	public TreeNode(int val) {
	    this.val = val;
	}

    }

    public boolean validateLevelOrder(int[] levelOrder) {

	if (levelOrder.length == 0)
	    return true;

	TreeNode root = new TreeNode(levelOrder[0]);
	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);
	int i = 1;
	while (!q.isEmpty() && i < levelOrder.length) {

	    TreeNode curRoot = q.poll();
	    if (curRoot.min < levelOrder[i] && levelOrder[i] < curRoot.val) {
		TreeNode node = new TreeNode(levelOrder[i]);
		node.min = curRoot.min;
		node.max = curRoot.val;
		q.add(node);
		i++;
		if (i == levelOrder.length)
		    break;
	    }
	    if (curRoot.val < levelOrder[i] && levelOrder[i] < curRoot.max) {
		TreeNode node = new TreeNode(levelOrder[i]);
		node.min = curRoot.val;
		node.max = curRoot.max;
		q.add(node);
		i++;
	    }

	}

	return i == levelOrder.length;
    }

}
package algorithim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTSprialOrder {
    public TreeNode root = null;

    public List<List<Integer>> btSprialOrderIter(TreeNode root) {
	List<List<Integer>> list = new LinkedList<>();
	if (root == null)
	    return list;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);
	int level = -1;
	LinkedList<Integer> curLvlList = null;
	while (!q.isEmpty()) {
	    level++;

	    int levelSize = q.size();
	    curLvlList = new LinkedList<>();
	    while (levelSize != 0) {
		TreeNode temp = q.poll();
		levelSize--;
		if (level % 2 != 0)
		    curLvlList.addFirst(temp.val);
		else
		    curLvlList.add(temp.val);

		if (temp.left != null)
		    q.add(temp.left);

		if (temp.right != null)
		    q.add(temp.right);
	    }

	    list.add(curLvlList);
	}

	return list;
    }

    public List<List<Integer>> btSprialOrderRecursive(TreeNode root) {
	List<List<Integer>> sol = new ArrayList<>();
	travel(root, sol, 0);
	return sol;
    }

    private void travel(TreeNode curr, List<List<Integer>> sol, int level) {
	if (curr == null)
	    return;

	if (sol.size() <= level) {
	    List<Integer> newLevel = new LinkedList<>();
	    sol.add(newLevel);
	}

	List<Integer> collection = sol.get(level);
	if (level % 2 != 0)
	    collection.add(0, curr.val);
	else
	    collection.add(curr.val);

	travel(curr.left, sol, level + 1);
	travel(curr.right, sol, level + 1);
    }
}
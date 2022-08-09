package algorithim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTDiagonalTraversal {
    public TreeNode root = null;

    public List<List<Integer>> diagonaleTraversal(TreeNode root) {
	if (root == null)
	    return null;

	List<List<Integer>> list = new ArrayList<>();

	diagonaleTraversal(root, list, 0);

	return list;
    }

    private void diagonaleTraversal(TreeNode root, List<List<Integer>> list, int level) {

	if (root == null)
	    return;

	if (list.size() == level) {
	    list.add(new ArrayList<Integer>());
	}

	list.get(level).add(root.val);

	diagonaleTraversal(root.left, list, level + 1);
	diagonaleTraversal(root.right, list, level);

    }

    public List<List<Integer>> diagonaleTraversalIter(TreeNode root) {

	List<Integer> list = new ArrayList<>();
	List<List<Integer>> sol = new ArrayList<>();

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);
	q.add(null);
	int dl = 0;
	while (!q.isEmpty()) {

	    TreeNode node = q.poll();

	    if (node == null) {
		sol.add(dl, list);
		list = new ArrayList<>();
		dl++;
		if (q.isEmpty())
		    break;
		else
		    q.add(null);
	    }

	    while (node != null) {

		list.add(node.val);
		if (node.left != null)
		    q.add(node.left);
		node = node.right;

	    }

	}

	return sol;
    }

}
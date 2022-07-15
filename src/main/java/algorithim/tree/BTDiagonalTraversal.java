package algorithim.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BTDiagonalTraversal {
    public TreeNode root = null;

    public List<List<Integer>> diagonaleTraversal(TreeNode root) {

	Map<Integer, List<Integer>> map = new HashMap<>();
	List<List<Integer>> list = new ArrayList<>();
	diagonaleTraversal(root, map, 0);

	for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
	    List<Integer> val = entry.getValue();
	    list.add(val);
	}
	return list;
    }

    private void diagonaleTraversal(TreeNode root, Map<Integer, List<Integer>> map, int dl) {

	if (root == null)
	    return;

	List<Integer> list = map.getOrDefault(dl, new ArrayList<>());
	list.add(root.value);
	map.put(dl, list);
	diagonaleTraversal(root.left, map, dl + 1);
	diagonaleTraversal(root.right, map, dl);

    }

    public List<List<Integer>> diagonaleTraversalIter(TreeNode root) {

	Map<Integer, List<Integer>> map = new HashMap<>();
	List<Integer> list = new ArrayList<>();
	List<List<Integer>> sol = new ArrayList<>();

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);
	q.add(null);
	int dl = 0;
	while (!q.isEmpty()) {

	    TreeNode node = q.poll();

	    if (node == null) {
		map.put(dl, list);
		list = new ArrayList<>();
		dl++;
		if (q.isEmpty())
		    break;
		else
		    q.add(null);
	    }

	    while (node != null) {

		list.add(node.value);
		if (node.left != null)
		    q.add(node.left);
		node = node.right;

	    }

	}

	for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
	    List<Integer> val = entry.getValue();
	    sol.add(val);
	}
	return sol;
    }

}
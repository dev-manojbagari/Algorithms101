package algorithim.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTVerticalOrder {
    public TreeNode root = null;

    private class Pair {

	TreeNode node;
	int hd;

	public Pair(TreeNode node, int hd) {
	    this.node = node;
	    this.hd = hd;
	}
    }

    public List<List<Integer>> btVerticalOrder(TreeNode root) {
	List<List<Integer>> list = new ArrayList<>();

	if (root == null)
	    return list;

	Queue<Pair> q = new LinkedList<>();

	HashMap<Integer, List<Integer>> map = new HashMap<>();

	q.add(new Pair(root, 0));
	int minHd = Integer.MAX_VALUE;
	int maxHd = Integer.MIN_VALUE;
	while (!q.isEmpty()) {

	    Pair temp = q.poll();
	    TreeNode node = temp.node;
	    int hd = temp.hd;

	    List<Integer> tempList = map.getOrDefault(hd, new ArrayList<Integer>());
	    tempList.add(node.value);
	    map.put(hd, tempList);

	    if (minHd > hd)
		minHd = hd;
	    if (hd > maxHd)
		maxHd = hd;

	    if (node.left != null)
		q.add(new Pair(node.left, hd - 1));

	    if (node.right != null)
		q.add(new Pair(node.right, hd + 1));

	}
	for (int i = minHd; i <= maxHd; i++) {
	    list.add(map.get(i));
	}

	return list;
    }

    public List<Integer> btVerticalSum(TreeNode root) {
	List<Integer> list = new ArrayList<>();

	if (root == null)
	    return list;

	Queue<Pair> q = new LinkedList<>();

	HashMap<Integer, Integer> map = new HashMap<>();

	q.add(new Pair(root, 0));
	int minHd = Integer.MAX_VALUE;
	int maxHd = Integer.MIN_VALUE;
	while (!q.isEmpty()) {

	    int levelSize = q.size();

	    while (levelSize != 0) {

		Pair temp = q.poll();
		TreeNode node = temp.node;
		int hd = temp.hd;
		levelSize--;

		int sum = map.getOrDefault(hd, 0);
		sum = sum + node.value;
		map.put(hd, sum);

		if (minHd > hd)
		    minHd = hd;
		if (hd > maxHd)
		    maxHd = hd;

		if (node.left != null)
		    q.add(new Pair(node.left, hd - 1));

		if (node.right != null)
		    q.add(new Pair(node.right, hd + 1));

	    }

	}
	for (int i = minHd; i <= maxHd; i++) {
	    list.add(map.get(i));
	}

	return list;
    }

}
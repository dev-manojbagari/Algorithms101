package algorithim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTPrintLevel {
    public TreeNode root = null;

    public List<Integer> printLevelRecusive(TreeNode root, int k) {

	List<Integer> list = new ArrayList<>();

	if (root == null)
	    return list;

	printLevelRecusive(root, list, k, 0);
	return list;
    }

    private void printLevelRecusive(TreeNode root, List<Integer> list, int k, int level) {

	if (root == null)
	    return;

	if (level == k)
	    list.add(root.val);

	printLevelRecusive(root.left, list, k, level + 1);
	printLevelRecusive(root.right, list, k, level + 1);

    }

    public List<Integer> printLevelIter(TreeNode root, int i) {
	List<Integer> list = new ArrayList<>();
	if (root == null)
	    return list;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);
	int levelSize;
	int curLevel = -1;
	while (!q.isEmpty()) {
	    curLevel++;
	    levelSize = q.size();

	    while (levelSize != 0) {
		TreeNode node = q.poll();
		levelSize--;

		if (curLevel == i)
		    list.add(node.val);

		if (node.left != null)
		    q.add(node.left);
		if (node.right != null)
		    q.add(node.right);

	    }

	}
	return list;

    }

}
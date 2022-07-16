package algorithim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLeftViewRightView {
    public TreeNode root = null;

    public List<Integer> btLeftView(TreeNode root) {
	List<Integer> list = new ArrayList<>();
	if (root == null)
	    return list;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);

	while (!q.isEmpty()) {

	    int levelSize = q.size();

	    list.add(q.peek().value);
	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		if (temp.left != null)
		    q.add(temp.left);

		if (temp.right != null)
		    q.add(temp.right);

	    }

	}

	return list;
    }

    public List<Integer> btRightView(TreeNode root) {
	List<Integer> list = new ArrayList<>();
	if (root == null)
	    return list;

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);

	while (!q.isEmpty()) {

	    int levelSize = q.size();

	    list.add(q.peek().value);
	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		if (temp.right != null)
		    q.add(temp.right);

		if (temp.left != null)
		    q.add(temp.left);

	    }

	}

	return list;
    }

    public List<Integer> btLeftViewRecur(TreeNode root) {

	List<Integer> list = new ArrayList<>();
	btLeftView(root, list, 0);
	return list;
    }

    private void btLeftView(TreeNode root, List<Integer> list, int level) {

	if (root == null)
	    return;

	if (list.size() <= level) {
	    list.add(root.value);
	}

	btLeftView(root.left, list, level + 1);
	btLeftView(root.right, list, level + 1);
    }

    public List<Integer> btRightViewRecur(TreeNode root) {
	List<Integer> list = new ArrayList<>();
	btRightview(root, list, 0);
	return list;
    }

    private void btRightview(TreeNode root, List<Integer> list, int level) {

	if (root == null)
	    return;

	if (list.size() <= level) {
	    list.add(root.value);
	}

	btRightview(root.right, list, level + 1);
	btRightview(root.left, list, level + 1);
    }

}
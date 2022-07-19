package algorithim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLeetCodeArrayFormatToBT {
    public TreeNode root = null;

    public static TreeNode convert(String arr) {

	String[] strArray = arr.split(",");

	Queue<TreeNode> q = new LinkedList<>();

	TreeNode root = new TreeNode(Integer.parseInt(strArray[0]));

	q.add(root);
	int i = 1;

	while (!q.isEmpty() && i < strArray.length) {

	    TreeNode node = null;
	    TreeNode curRoot = q.poll();
	    if (curRoot != null) {
		if (!strArray[i].equals("null")) {
		    node = new TreeNode(Integer.parseInt(strArray[i]));
		} else
		    node = null;

		i++;

		if (i >= strArray.length)
		    break;

		curRoot.left = node;
		q.add(node);

		if (!strArray[i].equals("null")) {
		    node = new TreeNode(Integer.parseInt(strArray[i]));
		} else
		    node = null;
		i++;
		curRoot.right = node;
		q.add(node);

	    }
	}

	return root;
    }

    public static List<Integer> toString(TreeNode root) {

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
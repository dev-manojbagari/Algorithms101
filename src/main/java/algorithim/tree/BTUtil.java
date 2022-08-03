package algorithim.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTUtil {
    public TreeNode root = null;

    public static TreeNode leetcodeConvert(String arr) {

	String[] strArray = arr.split(",");

	Queue<TreeNode> q = new LinkedList<>();

	TreeNode root = new TreeNode(Integer.parseInt(strArray[0].trim()));

	q.add(root);
	int i = 1;

	while (!q.isEmpty() && i < strArray.length) {

	    TreeNode node = null;
	    TreeNode curRoot = q.poll();
	    if (curRoot != null) {
		if (!strArray[i].equals("null")) {
		    node = new TreeNode(Integer.parseInt(strArray[i].trim()));
		} else
		    node = null;

		i++;

		if (i >= strArray.length)
		    break;

		curRoot.left = node;
		q.add(node);

		if (!strArray[i].equals("null")) {
		    node = new TreeNode(Integer.parseInt(strArray[i].trim()));
		} else
		    node = null;
		i++;
		curRoot.right = node;
		q.add(node);

	    }
	}

	return root;
    }

    public static TreeNode convert(String str) {

	if (str.contains("-1")) {

	    String[] split = str.split(" ");
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < split.length; i++) {
		if ("-1".equals(split[i]))
		    split[i] = "null";
		sb.append(split[i]).append(",");
	    }
	    str = sb.toString();
	}

	return leetcodeConvert(str);
    }

    public static String convert(TreeNode root) {

	StringBuilder sb = new StringBuilder();

	if (root == null)
	    return "";

	Queue<TreeNode> q = new LinkedList<>();
	q.add(root);

	while (!q.isEmpty()) {

	    int levelSize = q.size();

	    while (levelSize != 0) {

		TreeNode temp = q.poll();
		levelSize--;

		sb.append(temp.val).append(" ");

		if (temp.left != null)
		    q.add(temp.left);

		if (temp.right != null)
		    q.add(temp.right);

	    }

	}

	return sb.toString().trim();
    }

    public static String converToLeetCodeCompatible(String str) {

	String[] split = str.split(" ");
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < split.length; i++) {
	    if ("-1".equals(split[i]))
		split[i] = "null";
	    sb.append(split[i]).append(",");
	}

	return sb.toString();
    }

}
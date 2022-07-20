package algorithim.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BTSeralizeDeseralize {
    public TreeNode root = null;

    public String seralize(TreeNode root) {

	if (root == null)
	    return "$" + ",";

	StringBuilder sb = new StringBuilder();
	seralize(root, sb);

	return sb.toString();
    }

    private void seralize(TreeNode root, StringBuilder sb) {

	if (root == null) {
	    sb.append("$").append(",");
	    return;
	}
	sb.append(root.val).append(",");

	seralize(root.left, sb);
	seralize(root.right, sb);

    }

    public TreeNode deSeralize(String str) {

	if (str == null || str.length() == 0)
	    return null;

	Queue<String> nodes = new LinkedList<>(Arrays.asList(str.split(",")));

	return deSeralize(nodes);
    }

    private TreeNode deSeralize(Queue<String> nodes) {
	String str = nodes.poll();

	if (str == null || "$".equals(str))
	    return null;

	TreeNode node = new TreeNode(Integer.valueOf(str));

	node.left = deSeralize(nodes);
	node.right = deSeralize(nodes);

	return node;
    }

}
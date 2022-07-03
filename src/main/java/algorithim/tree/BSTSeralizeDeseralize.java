package algorithim.tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BSTSeralizeDeseralize {
    public TreeNode root = null;

    public String seralize(TreeNode root) {
	if (root == null)
	    return "";

	StringBuilder sb = new StringBuilder();

	seralize(root, sb);

	return sb.toString();
    }

    private void seralize(TreeNode root, StringBuilder sb) {

	if (root == null)
	    return;

	sb.append(root.value).append(",");

	seralize(root.left, sb);
	seralize(root.right, sb);

    }

    public TreeNode deSeralize(String str) {

	if (str.length() == 0)
	    return null;

	Queue<String> nodes = new LinkedList<>(Arrays.asList(str.split(",")));

	return deSeralize(nodes, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode deSeralize(Queue<String> nodes, int min, int max) {

	if (nodes.isEmpty())
	    return null;

	int nodeValue = Integer.parseInt(nodes.peek());

	if (min > nodeValue || nodeValue > max)
	    return null;

	TreeNode node = new TreeNode(Integer.parseInt(nodes.poll()));
	node.left = deSeralize(nodes, min, nodeValue);
	node.right = deSeralize(nodes, nodeValue, max);
	return node;

    }

}
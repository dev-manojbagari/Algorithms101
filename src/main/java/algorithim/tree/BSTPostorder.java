package algorithim.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTPostorder {
    public TreeNode root = null;

    public List<Integer> postOrderRecursive(TreeNode root) {
	List<Integer> list = new ArrayList<>();
	if (root == null)
	    return list;

	postOrderRecusive(root, list);

	return list;
    }

    private void postOrderRecusive(TreeNode root, List<Integer> list) {
	if (root == null)
	    return;

	postOrderRecusive(root.left, list);
	postOrderRecusive(root.right, list);
	list.add(root.value);

    }

    public List<Integer> postOrderIterative(TreeNode root) {

	List<Integer> list = new ArrayList<>();

	if (root == null)
	    return list;

	Stack<TreeNode> s1 = new Stack<>();
	Stack<TreeNode> s2 = new Stack<>();

	s1.add(root);

	while (!s1.isEmpty()) {
	    TreeNode temp = s1.pop();
	    s2.push(temp);

	    if (temp.left != null)
		s1.push(temp.left);

	    if (temp.right != null)
		s1.push(temp.right);

	}

	while (!s2.isEmpty()) {
	    TreeNode temp = s2.pop();
	    list.add(temp.value);
	}

	return list;
    }

}
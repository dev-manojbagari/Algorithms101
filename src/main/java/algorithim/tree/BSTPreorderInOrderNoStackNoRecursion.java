package algorithim.tree;

import java.util.ArrayList;
import java.util.List;

public class BSTPreorderInOrderNoStackNoRecursion {
    public TreeNode root = null;

    List<Integer> preOrder(TreeNode root) {

	List<Integer> list = new ArrayList<>();

	preOrder(root, list);

	return list;
    }

    private void preOrder(TreeNode root, List<Integer> list) {

	if (root == null)
	    return;
	TreeNode curr = root;

	while (curr != null) {
	    if (curr.left == null) {
		list.add(curr.val);
		curr = curr.right;
	    } else {

		TreeNode temp = curr.left;

		while (temp.right != null && temp.right != curr) {
		    temp = temp.right;
		}

		if (temp.right == null) {
		    temp.right = curr;
		    list.add(curr.val);
		    curr = curr.left;
		} else {
		    temp.right = null;
		    curr = curr.right;
		}

	    }

	}
    }

    List<Integer> inOrder(TreeNode root) {

	List<Integer> list = new ArrayList<>();

	inOrder(root, list);

	return list;
    }

    private void inOrder(TreeNode root, List<Integer> list) {

	if (root == null)
	    return;
	TreeNode curr = root;

	while (curr != null) {
	    if (curr.left == null) {
		list.add(curr.val);
		curr = curr.right;
	    } else {

		TreeNode temp = curr.left;

		while (temp.right != null && temp.right != curr) {
		    temp = temp.right;
		}

		if (temp.right == null) {
		    temp.right = curr;
		    curr = curr.left;
		} else {
		    temp.right = null;
		    list.add(curr.val);
		    curr = curr.right;
		}

	    }

	}
    }

}
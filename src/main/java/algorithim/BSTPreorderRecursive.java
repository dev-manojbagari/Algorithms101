package algorithim;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTPreorderRecursive {
    public TreeNode root = null;

    public static void main(String[] args) {
	BSTPreorderRecursive bst = new BSTPreorderRecursive();
	bst.root = new TreeNode(1);
	bst.root.left = new TreeNode(2);

	bst.root.right = new TreeNode(3);
	bst.root.right.left = new TreeNode(4);
	bst.root.right.left.left = new TreeNode(5);
	bst.root.right.right = new TreeNode(6);

	bst.root.right.right.left = new TreeNode(7);
	bst.root.right.right.right = new TreeNode(8);

	bst.preOrder(bst.root);

    }

    List<Integer> preOrder(TreeNode root) {

	List<Integer> list = new ArrayList<>();

	preOrder(root, list);

	return list;
    }

    void preOrder(TreeNode root, List<Integer> list) {

	if (root == null)
	    return;

	list.add(root.value);

	preOrder(root.left, list);
	preOrder(root.right, list);

    }

}
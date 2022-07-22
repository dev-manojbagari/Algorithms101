package algorithim.tree;

import java.util.ArrayList;
import java.util.List;

public class BTAllNodesAtDistanceK {
    public TreeNode root = null;

    public List<Integer> allNodesAtDistanceK(TreeNode root, TreeNode target, int distance) {
	List<Integer> list = new ArrayList<>();

	if (root == null)
	    return list;

	allNodesAtDistanceK(root, list, target, distance);

	return list;
    }

    private int allNodesAtDistanceK(TreeNode root, List<Integer> list, TreeNode target, int distance) {

	if (root == null)
	    return -1;

	if (root == target) {
	    allNodesBelowAtDistanceK(root, list, distance);
	    return 0;
	}

	int l = allNodesAtDistanceK(root.left, list, target, distance);

	if (l != -1) {
	    if (l + 1 == distance) {
		list.add(root.val);
	    } else if (l + 1 < distance) {
		allNodesBelowAtDistanceK(root.right, list, distance - l - 2);
	    }
	    return l + 1;
	}

	int r = allNodesAtDistanceK(root.right, list, target, distance);

	if (r != -1) {
	    if (r + 1 == distance) {
		list.add(root.val);
	    } else if (r + 1 < distance) {
		allNodesBelowAtDistanceK(root.left, list, distance - r - 2);
	    }
	    return r + 1;
	}

	return -1;
    }

    private void allNodesBelowAtDistanceK(TreeNode root, List<Integer> list, int distance) {

	if (root == null)
	    return;

	if (distance == 0)
	    list.add(root.val);

	allNodesBelowAtDistanceK(root.left, list, distance - 1);
	allNodesBelowAtDistanceK(root.right, list, distance - 1);

    }

}
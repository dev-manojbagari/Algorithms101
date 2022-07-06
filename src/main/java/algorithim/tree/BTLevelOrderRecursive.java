package algorithim.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTLevelOrderRecursive {
    public TreeNode root = null;

    public List<List<Integer>> levelOrderRecursive(TreeNode root) {
	List<List<Integer>> sol = new ArrayList<>();
	levelOrderRecursive(root, sol, 0);
	return sol;
    }

    private void levelOrderRecursive(TreeNode curr, List<List<Integer>> sol, int level) {
	if (curr == null)
	    return;

	if (sol.size() <= level) {
	    List<Integer> newLevel = new LinkedList<>();
	    sol.add(newLevel);
	}

	List<Integer> collection = sol.get(level);
	collection.add(curr.value);

	levelOrderRecursive(curr.left, sol, level + 1);
	levelOrderRecursive(curr.right, sol, level + 1);
    }

}
package algorithim.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BTFindAllDupSub {
    public TreeNode root = null;

    public List<Integer> findDuplicateSubtrees(TreeNode root) {

	if (root == null)
	    return null;
	List<Integer> list = new ArrayList<>();
	findDuplicateSubtrees(root, new HashMap<String, Integer>(), list);

	return list;
    }

    private String findDuplicateSubtrees(TreeNode root, HashMap<String, Integer> map, List<Integer> list) {

	if (root == null) {
	    return "#";
	}

	String leftST = findDuplicateSubtrees(root.left, map, list);
	String rightST = findDuplicateSubtrees(root.right, map, list);

	StringBuilder sb = new StringBuilder(leftST).append(",").append(rightST).append(",").append(root.val);
	String curSubTree = sb.toString();
	if (curSubTree.length() >= 5 && map.containsKey(curSubTree) && map.get(curSubTree) == 1)
	    list.add(root.val);

	map.put(curSubTree, map.getOrDefault(curSubTree, 0) + 1);

	return curSubTree;

    }

}
package algorithim.tree;

import java.util.HashMap;
import java.util.Map;

public class BTConstructBTUsingPreOrderInOrder {

    public TreeNode root = null;
    int i = 0;

    public TreeNode buildTree(int[] pre, int[] in) {

	if (in == null || in.length == 0 || pre == null || pre.length == 0)
	    return null;

	Map<Integer, Integer> map = new HashMap<>();

	for (int i = 0; i < in.length; i++)
	    map.put(in[i], i);

	return buildTree(in, pre, map, 0, in.length);
    }

    private TreeNode buildTree(int[] in, int[] pre, Map<Integer, Integer> map, int start, int end) {

	if (i == pre.length || start > end)
	    return null;

	TreeNode root = new TreeNode(pre[i]);

	int k = map.get(pre[i]);
	i++;

	root.left = buildTree(in, pre, map, start, k - 1);
	root.right = buildTree(in, pre, map, k + 1, end);

	return root;
    }

}
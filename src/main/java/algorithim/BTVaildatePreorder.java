package algorithim;

import java.util.Stack;

//Check if a given array can represent Preorder Traversal of Binary Search Tree
//https://www.geeksforgeeks.org/check-if-a-given-array-can-represent-preorder-traversal-of-binary-search-tree/

public class BTVaildatePreorder {
    public TreeNode root = null;

    // O(n^2)
    public boolean vaildatePreOrderRecursive(int[] pre) {

	if (pre.length == 0)
	    return true;

	return vaildatePreOrderRecursive(pre, 0, pre.length - 1);
    }

    private boolean vaildatePreOrderRecursive(int[] pre, int start, int end) {

	if (start >= end)
	    return true;

	int i = start + 1;
	boolean rightChildFound = false;
	int rightChildIndex = -1;
	for (; i <= end; i++) {
	    if (pre[start] < pre[i]) {
		rightChildIndex = i;
		rightChildFound = true;
	    }
	    if (pre[start] > pre[i]) {
		if (rightChildFound) {
		    // right subtree has element smaller than root hence its not a valid bst
		    // preorder

		    return false;
		}

	    }

	}

	if (!rightChildFound) {
	    // we only have left subtree to process
	    return vaildatePreOrderRecursive(pre, start + 1, end);

	} else {

	    boolean l = vaildatePreOrderRecursive(pre, start + 1, rightChildIndex - 1);
	    boolean r = vaildatePreOrderRecursive(pre, rightChildIndex, end);

	    return l && r;

	}

    }

    // O(n^2)
    public boolean vaildatePreOrderRecursiveMinMax(int[] pre) {

	if (pre.length == 0)
	    return true;

	return vaildatePreOrderRecursiveMinMax(pre, 0, pre.length - 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean vaildatePreOrderRecursiveMinMax(int[] pre, int start, int end, int min, int max) {
	if (start >= end)
	    return true;

	int root = pre[start];
	int i;
	for (i = start; i <= end; i++) {
	    if (min > pre[i] || max < pre[i])
		return false;

	    if (root < pre[i])
		break;

	}

	boolean l = vaildatePreOrderRecursiveMinMax(pre, start + 1, i - 1, min, root);
	boolean r = vaildatePreOrderRecursiveMinMax(pre, i, end, root, max);

	return l && r;
    }

    // O(n)
    public boolean vaildatePreOrderIterative(int[] pre) {

	if (pre.length == 0)
	    return true;

	Stack<Integer> stack = new Stack<>();
	Integer root = Integer.MIN_VALUE;

	for (int i = 0; i < pre.length; i++) {

	    if (root > pre[i])
		return false;

	    while (!stack.isEmpty() && stack.peek() < pre[i]) {
		root = stack.pop();
	    }

	    stack.push(pre[i]);

	}

	return true;
    }

}
package algorithim.tree;

import java.util.Stack;

public class BTVaildatePostorder {
    public TreeNode root = null;

    // O(n^2)
    public boolean vaildatePostOrderRecursive(int[] post) {

	if (post.length == 0)
	    return true;

	return vaildatePostOrderRecursive(post, 0, post.length - 1);
    }

    private boolean vaildatePostOrderRecursive(int[] post, int start, int end) {

	if (start >= end)
	    return true;

	int root = post[end];
	int leftChildIndex = -1;
	boolean leftChildFound = false;

	for (int i = end - 1; i >= start; i--) {
	    if (root > post[i]) {
		leftChildIndex = i;
		leftChildFound = true;
	    }
	    if (leftChildFound) {
		if (root < post[i])
		    return false;
	    }
	}

	if (!leftChildFound)
	    return vaildatePostOrderRecursive(post, start, end - 1);
	else {
	    boolean l = vaildatePostOrderRecursive(post, leftChildIndex, end - 1);
	    boolean r = vaildatePostOrderRecursive(post, start, leftChildIndex - 1);
	    return l && r;
	}

    }

    // O(n^2)
    public boolean vaildatePostOrderRecursiveMinMax(int[] post) {

	if (post.length == 0)
	    return true;

	return vaildatePostOrderRecursiveMinMax(post, 0, post.length - 1, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private boolean vaildatePostOrderRecursiveMinMax(int[] post, int start, int end, int min, int max) {

	if (start >= end)
	    return true;

	int root = post[end];
	int i;
	for (i = end - 1; i >= start; i--) {
	    if (min > post[i] || post[i] > max)
		return false;

	    if (root > post[i])
		break;

	}

	boolean l = vaildatePostOrderRecursiveMinMax(post, start, i, min, root);
	boolean r = vaildatePostOrderRecursiveMinMax(post, i + 1, end - 1, root, max);

	return l && r;
    }

// O(n)
    public boolean vaildatePostOrderIterative(int[] post) {
	if (post.length == 0)
	    return true;

	int root = Integer.MAX_VALUE;
	Stack<Integer> stack = new Stack<>();

	for (int i = post.length - 1; i >= 0; i--) {

	    if (root < post[i])
		return false;

	    while (!stack.isEmpty() && stack.peek() > post[i]) {
		root = stack.pop();
	    }

	    stack.push(post[i]);

	}

	return true;
    }

}
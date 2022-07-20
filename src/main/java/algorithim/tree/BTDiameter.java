package algorithim.tree;

public class BTDiameter {
    public TreeNode root = null;

    // O(n^2)
    public int diameter(TreeNode root) {
	if (root == null)
	    return 0;

	int lh = root.left == null ? -1 : height(root.left);
	int rh = root.right == null ? -1 : height(root.right);

	int ld = diameter(root.left);
	int rd = diameter(root.right);

	return Math.max(2 + lh + rh, Math.max(ld, rd));
    }

    private int height(TreeNode root) {
	if (root == null || root.left == null && root.right == null)
	    return 0;

	return 1 + Math.max(height(root.left), height(root.right));
    }

    private class Height {
	int h;
    }

    // O(n)
    public int diameter2(TreeNode root) {

	return diameter2(root, new Height());
    }

    public int diameter2(TreeNode root, Height height) {
	if (root == null) {
	    height.h = -1;
	    return 0;
	}

	Height lh = new Height();
	Height rh = new Height();

	int ld = diameter2(root.left, lh);
	int rd = diameter2(root.right, rh);

	height.h = 1 + Math.max(lh.h, rh.h);

	return Math.max(2 + lh.h + rh.h, Math.max(ld, rd));
    }

// o(n) but faster 
    public int diameter3(TreeNode root) {
	if (root == null)
	    return 0;

	int[] m = { Integer.MIN_VALUE };
	Height(root, m);
	return m[0];
    }

    int Height(TreeNode root, int[] m) {
	if (root == null)
	    return -1;

	int l = Height(root.left, m);
	int r = Height(root.right, m);

	m[0] = Math.max(m[0], 2 + l + r);

	return 1 + Math.max(l, r);

    }

}
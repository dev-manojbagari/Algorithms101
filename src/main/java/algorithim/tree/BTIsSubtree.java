package algorithim.tree;

public class BTIsSubtree {
    public TreeNode root = null;

    public boolean isSubtree(TreeNode T, TreeNode S) {
	if (T == null && S == null)
	    return true;

	if (T == null || S == null)
	    return false;

	if (isIdentical(T, S))
	    return true;

	return isSubtree(T.left, S) || isSubtree(T.right, S);
    }

    private boolean isIdentical(TreeNode T, TreeNode S) {

	if (T == null && S == null)
	    return true;

	if (T == null || S == null)
	    return false;

	if (T.val != S.val)
	    return false;

	return isIdentical(T.left, S.left) && isIdentical(T.right, S.right);
    }

    public boolean isSubtree2(TreeNode T, TreeNode S) {
	if (T == null && S == null)
	    return true;

	if (T == null || S == null)
	    return false;

	StringBuilder preT = new StringBuilder();
	StringBuilder preS = new StringBuilder();

	preOrder(T, preT);
	preOrder(S, preS);

	boolean contains = preT.toString().contains(preS);
	return contains;// replacing contains with kmp will get o(n) solution
    }

    private void preOrder(TreeNode T, StringBuilder preT) {

	if (T == null) {
	    preT.append(",").append("#");// we adding , before each value so 2 does not become substring of 12
	} else {
	    preT.append(",").append(T.val + "");
	    preOrder(T.left, preT);
	    preOrder(T.right, preT);
	}

    }

}
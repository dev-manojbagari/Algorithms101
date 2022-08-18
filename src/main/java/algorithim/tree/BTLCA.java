package algorithim.tree;

public class BTLCA {
    public TreeNode root = null;

    public TreeNode lca(TreeNode root, int i, int j) {

	if (root == null)
	    return null;

	TreeNode LCA = lcaRec(root, i, j, null);

	if (LCA.val == i)
	    return find(LCA, j) == true ? LCA : null;
	else if (LCA.val == j)
	    return find(LCA, i) == true ? LCA : null;

	return LCA;
    }

    private boolean find(TreeNode root, int i) {
	if (root == null)
	    return false;
	if (root.val == i)
	    return true;

	return find(root.left, i) || find(root.right, i);
    }

    private TreeNode lcaRec(TreeNode root, int i, int j, TreeNode LCA) {

	if (LCA != null)
	    return LCA;

	if (root == null)
	    return null;

	if (root.val == i || root.val == j)
	    return root;

	TreeNode l = lcaRec(root.left, i, j, LCA);
	TreeNode r = lcaRec(root.right, i, j, LCA);

	if (l != null && r != null) {
	    LCA = root;
	    return root;
	}

	return l != null ? l : r;
    }
    /*
    class Solution {
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root == null) return null;
	        
	        if(isChildOf(p,q)) return q;
	        if(isChildOf(q,p)) return p;
	        
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        TreeNode lca = null;
	        
	        while(!queue.isEmpty()){
	            
	            TreeNode node = queue.poll();
	            lca = node;
	            
	            if(node == p || node == q)
	                break;
	            if(node.left != null && isChildOf(p,node.left) && isChildOf(q,node.left))
	                queue.offer(node.left);
	            if(node.right != null && isChildOf(p,node.right) && isChildOf(q,node.right))
	                queue.offer(node.right);
	            
	        }
	        
	        return lca;
	    }
	    public boolean isChildOf(TreeNode child,TreeNode parent){
	        if(parent == null)
	            return false;
	        if(parent == child)
	            return true;
	        // System.out.println(child.val+" "+parent.val);
	        return isChildOf(child,parent.left) || isChildOf(child,parent.right);
	    }
	}
	*/

}
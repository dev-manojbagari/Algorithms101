package algorithim.tree;

public class BSTSearch {
	public TreeNode root = null;

	public boolean searchIterative(TreeNode root, int value) {
	
		if(root==null)
			return false;
		else
		{
			TreeNode curr = root;

			while(curr!=null)
			{
				if(curr.value<value)
					curr=curr.right;
				else if(curr.value>value)
					curr=curr.left;
				else
					return true;
			}
			
		}
		
		return false;
	}

	public boolean searchRecursive(TreeNode root, int value) {

		if(root==null)
			return false;
		else if(root.value<value)
			return searchRecursive(root.right, value);
		else if(root.value>value)
			return searchRecursive(root.left, value);
		else
			return true;
	}

}
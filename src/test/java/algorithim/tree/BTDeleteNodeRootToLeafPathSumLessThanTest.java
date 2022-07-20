package algorithim.tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BTDeleteNodeRootToLeafPathSumLessThanTest {

    BTDeleteNodeRootToLeafSumLessThan bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTDeleteNodeRootToLeafSumLessThan();

    }
    
    /*
   
	              1 
	          /      \
	         2        3
	       /   \        \
	      4     5        7
	       \    /       /
	        9  12      10
	       / \           \
	      13  14         11
	          / 
	         15 

	    For input k = 45, the tree should be changed to following.
	          1 
	        / 
	       2   
	      / 
	     4  
	      \   
	       9    
	        \   
	         14 
	         /
	        15 
*/

    @Test
    public void btDeleteNodeRootToLeafSumLessThanTest() {

	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.left.left.right = new TreeNode(9);
	bt.root.left.left.right.left = new TreeNode(13);
	bt.root.left.left.right.right = new TreeNode(14);
	bt.root.left.left.right.right.left = new TreeNode(15);

	bt.root.right = new TreeNode(3);
	bt.root.right.right = new TreeNode(7);
	bt.root.right.right.left = new TreeNode(10);
	bt.root.right.right.left.right = new TreeNode(11);
	
	bt.bstDeleteNodeRootToLeadPathSumLessThan(bt.root, 45);

        assertEquals(bt.root.val, 1);
        assertEquals(bt.root.left.val, 2);
        assertEquals(bt.root.left.left.val, 4);
        assertEquals(bt.root.left.left.right.val, 9);
        assertEquals(bt.root.left.left.right.right.val, 14);
        assertEquals(bt.root.left.left.right.right.left.val, 15);
        
        assertNull(bt.root.right);
        assertNull(bt.root.left.right);

    }

}

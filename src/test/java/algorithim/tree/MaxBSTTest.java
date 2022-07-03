package algorithim.tree;

import static org.junit.Assert.*;

import java.util.OptionalInt;

import org.junit.Before;
import org.junit.Test;



public class MaxBSTTest {

	MaxBST bst;
	
	@Before
	public void setUp() throws Exception {
		bst = new MaxBST();
	}

	@Test
	public void maxBSTTest() {

		assertEquals(OptionalInt.empty(), bst.maxBST(null));
		
		bst.root = new TreeNode(8);
		bst.root.left =new TreeNode(4);
		bst.root.left.left=new TreeNode(2);
		bst.root.left.right=new TreeNode(6);
		
		assertEquals(8, bst.maxBST(bst.root).getAsInt());
		
		
		bst.root.right =new TreeNode(12);
		
		bst.root.right.left =new TreeNode(10);
		bst.root.right.right =new TreeNode(14);
		assertEquals(14, bst.maxBST(bst.root).getAsInt());
		
		bst.root.right.right =null;
		assertEquals(12, bst.maxBST(bst.root).getAsInt());


		bst.root=null;
		
		bst.root = new TreeNode(-8);
		bst.root.right =new TreeNode(-4);
		bst.root.right.right=new TreeNode(-2);
		bst.root.right.left=new TreeNode(-6);
		
		assertEquals(-2, bst.maxBST(bst.root).getAsInt());
		
	}

}

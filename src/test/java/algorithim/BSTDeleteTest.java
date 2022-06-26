package algorithim;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import algorithim.BSTInsert;

public class BSTDeleteTest {

	BSTDelete bst;

	@Before
	public void setUp() throws Exception {
		bst = new BSTDelete();
	}

	@Test
	public void testBstDeleteIterative() {

		bst.root = new TreeNode(8);
		bst.root.left =new TreeNode(4);
		bst.root.left.left=new TreeNode(2);
		bst.root.left.right=new TreeNode(6);
		
		
		bst.root.right =new TreeNode(12);
		
		bst.root.right.left =new TreeNode(10);
		bst.root.right.right =new TreeNode(14);
		
		
		//zero child node
		assertEquals(14, bst.root.right.right.value);
		bst.deleteIterative(bst.root, 14);
		assertNull(bst.root.right.right);
		
		//one child node
		assertEquals(12, bst.root.right.value);
		bst.deleteIterative(bst.root, 12);
		assertEquals(10, bst.root.right.value);;
		
		//two child node
		assertEquals(8, bst.root.value);
		bst.deleteIterative(bst.root, 8);
		assertEquals(10, bst.root.value);;
		
		bst.root=null;

	}

	
	@Test
	public void testBstDeleteRecurisve() {

		bst.root = new TreeNode(8);
		bst.root.left =new TreeNode(4);
		bst.root.left.left=new TreeNode(2);
		bst.root.left.right=new TreeNode(6);
		
		
		bst.root.right =new TreeNode(12);
		
		bst.root.right.left =new TreeNode(10);
		bst.root.right.right =new TreeNode(14);
		
		
		//zero child node
		assertEquals(14, bst.root.right.right.value);
		bst.deleteRecursive(bst.root, 14);
		assertNull(bst.root.right.right);
		
		//one child node
		assertEquals(12, bst.root.right.value);
		bst.deleteRecursive(bst.root, 12);
		assertEquals(10, bst.root.right.value);;
		
		//two child node
		assertEquals(8, bst.root.value);
		bst.deleteRecursive(bst.root, 8);
		assertEquals(10, bst.root.value);;
		
		bst.root=null;
	}
	
	
}

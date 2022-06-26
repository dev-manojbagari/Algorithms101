package algorithim;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BSTSearchTest {

	BSTSearch bst;
	
	
	@Before
	public void setUp() throws Exception {
		
		bst = new BSTSearch();
	}

	@Test
	public void testBstSearchIterative () {
		
		bst.root = new TreeNode(8);
		bst.root.left =new TreeNode(4);
		bst.root.right =new TreeNode(12);
		
		assertTrue(bst.searchIterative(bst.root, 8));
		assertTrue(bst.searchIterative(bst.root, 4));
		assertTrue(bst.searchIterative(bst.root, 12));
		assertFalse(bst.searchIterative(bst.root, 120));
			
	}
	
	
	@Test
	public void testBstSearchRecursive() {
		
		bst.root = new TreeNode(8);
		bst.root.left =new TreeNode(4);
		bst.root.right =new TreeNode(12);
		
		assertTrue(bst.searchRecursive(bst.root, 8));
		assertTrue(bst.searchRecursive(bst.root, 4));
		assertTrue(bst.searchRecursive(bst.root, 12));
		assertFalse(bst.searchRecursive(bst.root, 120));
			
	}
	
	
	

}

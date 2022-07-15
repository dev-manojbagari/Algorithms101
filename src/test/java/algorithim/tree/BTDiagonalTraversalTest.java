package algorithim.tree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTDiagonalTraversalTest {

    BTDiagonalTraversal bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTDiagonalTraversal();
    }

    @Test
    public void diagonaleTraversalRecurTest() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 3, 7), Arrays.asList(2, 5, 6), Arrays.asList(4));

	List<List<Integer>> list2 = bt.diagonaleTraversal(bt.root);
	assertEquals(list1.size(), list2.size());
	int i = 0;
	assertEquals(list2.get(i), list1.get(i++));
	assertEquals(list2.get(i), list1.get(i++));
	assertEquals(list2.get(i), list1.get(i++));

    }

    @Test
    public void diagonaleTraversalIterTest() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 3, 7), Arrays.asList(2, 5, 6), Arrays.asList(4));

	List<List<Integer>> list2 = bt.diagonaleTraversalIter(bt.root);
	assertEquals(list1.size(), list2.size());
	int i = 0;
	assertEquals(list2.get(i), list1.get(i++));
	assertEquals(list2.get(i), list1.get(i++));
	assertEquals(list2.get(i), list1.get(i++));

    }

}

package algorithim.tree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTBoundaryTraversalTest {

    BTBoundaryTraversal bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTBoundaryTraversal();
    }

    @Test
    public void test() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<Integer> list1 = Arrays.asList(1, 2, 4, 5, 6, 7, 3);
	List<Integer> list2 = bt.boundaryTraversal(bt.root);

	assertEquals(list1, list2);
    }

    @Test
    public void test2() {
	bt.root = new TreeNode(20);
	bt.root.left = new TreeNode(8);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(12);
	bt.root.left.right.left = new TreeNode(10);
	bt.root.left.right.right = new TreeNode(14);
	bt.root.right = new TreeNode(22);
	bt.root.right.right = new TreeNode(25);
	List<Integer> list1 = Arrays.asList(20, 8, 4, 10, 14, 25, 22);
	List<Integer> list2 = bt.boundaryTraversal(bt.root);

	assertEquals(list1, list2);
    }

    @Test
    public void test3() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(3);
	bt.root.left.left.right = new TreeNode(4);
	bt.root.left.left.right.left = new TreeNode(5);
	bt.root.left.left.right.right = new TreeNode(6);
	bt.root.right = new TreeNode(7);
	bt.root.right.right = new TreeNode(8);
	bt.root.right.right.left = new TreeNode(9);
	bt.root.right.right.left.left = new TreeNode(10);
	bt.root.right.right.left.right = new TreeNode(11);

	List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 10, 11, 9, 8, 7);
	List<Integer> list2 = bt.boundaryTraversal(bt.root);

	assertEquals(list1, list2);
    }

}

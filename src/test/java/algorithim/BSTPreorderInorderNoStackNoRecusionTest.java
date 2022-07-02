package algorithim;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BSTPreorderInorderNoStackNoRecusionTest {

    BSTPreorderInOrderNoStackNoRecursion bst;

    @Before
    public void setUp() throws Exception {
	bst = new BSTPreorderInOrderNoStackNoRecursion();

    }

    @Test
    public void bstPreorderNoStackNoRecusionTest() {
	bst.root = new TreeNode(1);
	bst.root.left = new TreeNode(2);

	bst.root.right = new TreeNode(3);
	bst.root.right.left = new TreeNode(4);
	bst.root.right.left.left = new TreeNode(5);
	bst.root.right.right = new TreeNode(6);

	bst.root.right.right.left = new TreeNode(7);
	bst.root.right.right.right = new TreeNode(8);
	List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	List<Integer> list2 = bst.preOrder(bst.root);

	assertEquals(list1, list2);

    }

    @Test
    public void bstInorderNoStackNoRecusionTest() {
	bst.root = new TreeNode(3);
	bst.root.left = new TreeNode(1);
	bst.root.left.right = new TreeNode(2);

	List<Integer> list1 = Arrays.asList(1, 2, 3);
	List<Integer> list2 = bst.inOrder(bst.root);

	assertEquals(list1, list2);

    }

}

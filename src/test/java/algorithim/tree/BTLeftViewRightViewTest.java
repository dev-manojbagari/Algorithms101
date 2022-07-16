package algorithim.tree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTLeftViewRightViewTest {

    BTLeftViewRightView bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTLeftViewRightView();
    }

    @Test
    public void btLeftViewTest() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<Integer> list1 = Arrays.asList(1, 2, 4);
	List<Integer> list2 = bt.btLeftView(bt.root);

	assertEquals(list1, list2);

    }

    @Test
    public void btRighttViewTest() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<Integer> list1 = Arrays.asList(1, 3, 7);
	List<Integer> list2 = bt.btRightView(bt.root);

	assertEquals(list1, list2);
    }

    @Test
    public void btLeftViewRecurTest() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<Integer> list1 = Arrays.asList(1, 2, 4);
	List<Integer> list2 = bt.btLeftViewRecur(bt.root);

	assertEquals(list1, list2);

    }

    @Test
    public void btRighttViewRecurTest() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<Integer> list1 = Arrays.asList(1, 3, 7);
	List<Integer> list2 = bt.btRightViewRecur(bt.root);

	assertEquals(list1, list2);
    }
}

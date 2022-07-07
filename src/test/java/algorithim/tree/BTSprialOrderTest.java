package algorithim.tree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTSprialOrderTest {
    BTSprialOrder bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTSprialOrder();

    }

    @Test
    public void btSprialOrderIterTest() {

	bt.root = new TreeNode(5);
	bt.root.left = new TreeNode(3);
	bt.root.left.left = new TreeNode(2);
	bt.root.left.right = new TreeNode(4);

	bt.root.right = new TreeNode(7);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(8);

	List<Integer> list1 = Arrays.asList(5, 3, 7, 8, 6, 4, 2);
	List<Integer> list2 = bt.btSprialOrderIter(bt.root);

	assertEquals(list1, list2);

	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.right = new TreeNode(3);
	bt.root.left.left = new TreeNode(7);
	bt.root.left.right = new TreeNode(6);
	bt.root.right.left = new TreeNode(5);
	bt.root.right.right = new TreeNode(4);

	List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	List<Integer> list4 = bt.btSprialOrderIter(bt.root);

	assertEquals(list3, list4);

    }

    @Test
    public void btSprialOrderRecursiveTest() {

	bt.root = new TreeNode(5);
	bt.root.left = new TreeNode(3);
	bt.root.left.left = new TreeNode(2);
	bt.root.left.right = new TreeNode(4);

	bt.root.right = new TreeNode(7);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(8);

	List<Integer> list1 = Arrays.asList(5, 3, 7, 8, 6, 4, 2);
	List<List<Integer>> temp = bt.btSprialOrderRecursive(bt.root);

	List<Integer> list2 = new LinkedList<>();

	for (List<Integer> list : temp) {
	    list2.addAll(list);
	}

	assertEquals(list1, list2);

	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.right = new TreeNode(3);
	bt.root.left.left = new TreeNode(7);
	bt.root.left.right = new TreeNode(6);
	bt.root.right.left = new TreeNode(5);
	bt.root.right.right = new TreeNode(4);

	List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	List<List<Integer>> temp2 = bt.btSprialOrderRecursive(bt.root);

	List<Integer> list4 = new LinkedList<>();

	for (List<Integer> list : temp2) {
	    list4.addAll(list);
	}

	assertEquals(list3, list4);

    }

}

package algorithim.tree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BTLevelOrderRecursiveTest {

    BTLevelOrderRecursive bt;

    @Before
    public void setUp() throws Exception {
	bt = new BTLevelOrderRecursive();
    }

    @Test
    public void btLevelorderRecusivetest() {
	bt.root = new TreeNode(1);
	bt.root.left = new TreeNode(2);
	bt.root.left.left = new TreeNode(4);
	bt.root.left.right = new TreeNode(5);
	bt.root.right = new TreeNode(3);
	bt.root.right.left = new TreeNode(6);
	bt.root.right.right = new TreeNode(7);
	List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	List<List<Integer>> listofList = bt.levelOrderRecursive(bt.root);

	List<Integer> list2 = new LinkedList<>();

	for (List<Integer> list : listofList) {
	    list2.addAll(list);
	}

	assertEquals(list1, list2);

    }
}
